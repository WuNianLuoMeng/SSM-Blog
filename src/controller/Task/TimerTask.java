package controller.Task;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import controller.Blog.LookBlogController;
import mapper.TbBlogarticalMapper;
import mapper.TbHomeMapper;
import pojo.TbBlogartical;
import pojo.TbHome;
import pojo.TbHomeExample;
import redis.clients.jedis.JedisCluster;
import service.All;

/**
 * 
 * 类名称：TimerTask   
 * 类描述：定时器任务
 *
 */
/*
 * 
一个cron表达式有至少6个（也可能7个）有空格分隔的时间元素。

按顺序依次为

秒（0~59）

分钟（0~59）

小时（0~23）

天（月）（0~31，但是你需要考虑你月的天数）

月（0~11）

天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）

7.年份（1970－2099）

 */
@Component
public class TimerTask {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Autowired
	private TbHomeMapper homemapper;
	@Autowired
	private JedisCluster jediscluster;
	@Autowired
	private SolrServer solrserver;
	@Autowired
	private All Service;
	/**
	 * 每个5秒将用户的访问量更新到数据库当中
	 */
  @Scheduled(cron = "0/5 * * * * ?")//每隔5秒隔行一次 
  public void SaveTraffic()
  {
	  Map<Integer,Integer> map=LookBlogController.ReadBLogNumber;
	  for(Integer x:map.keySet()) {		  
		  mapper.MyUpdate(map.get(x), x);		  		  
	  }
  }
  /**
   * 每个一天去更新redis缓存中热门博客的内容
   */
  @Scheduled(cron = "0 0 0/1 * * ?")//每隔一个小时执行一次 
  public void UpdateRedis() throws Exception
  {
	  jediscluster.del("cache");
	  //更新
	  List<TbBlogartical> list = mapper.MySelect();
	  /*删除热门博客中的所有记录*/
	  TbHomeExample example = new TbHomeExample();
	  homemapper.deleteByExample(example);
	  /*然后将前10的博客写入到热门博客的表当中*/
	  for(TbBlogartical x:list) {
		  TbHome a = new TbHome();
		  a.setBlogcontent(x.getBlogcontent());
		  a.setBlogdata(x.getBlogdata());
		  a.setBlogid(x.getBlogid());
		  a.setBlogtitle(x.getBlogtitle());
		  a.setBlogtraffic(x.getBlogtraffic());
		  a.setBlogusernumber(x.getBlogusernumber());
		  homemapper.insert(a);
	  }
  } 
  /**
   * 每个一天去更新solr
 * @throws Exception 
   */
  @Scheduled(cron = "0 0 12 * * ?")//每天中午12点
  public void UpdateSolr() throws Exception
  {
	  	List<TbBlogartical> list = Service.qury();
		for(TbBlogartical x:list) {
			SolrInputDocument document = new SolrInputDocument();
	        //添加域
	        document.addField("id", x.getBlogid());
	        document.addField("title",x.getBlogtitle());
	        //写入索引库
	        solrserver.add(document);
		}
		solrserver.commit();
  } 
}
