package serviceImpl;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Util.JsonUtils;
import mapper.TbHomeMapper;

import pojo.TbHome;
import pojo.TbHomeExample;
import redis.clients.jedis.JedisCluster;

import service.home;
import Util.MyJedisCLuster;
@Service
public class homeImpl implements home {
	private static Integer Index = 0;
	@Autowired
	private MyJedisCLuster jediscluster;
//	private JedisCluster jediscluster;
	@Autowired
	private TbHomeMapper mapper;
	@Override
	public List<TbHome> GetBlogList() throws Exception {				
		//使用redis缓存
		try {
			
			String result=jediscluster.GetList().get((Index++)%5).hget("cache","BlogList");
			if(!(result==null||result=="")){
				//System.out.println(JsonUtils.jsonToList(result, TbHome.class));
				return JsonUtils.jsonToList(result, TbHome.class);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
				
		
		
//		System.out.println("Not user cache");
		TbHomeExample example = new TbHomeExample();
		
		List<TbHome> list = mapper.selectByExample(example);
			
		//当redis中没有所要查询的Content时，那么此时就要将数据加入到缓存当中	
		try {
			
			String result=JsonUtils.objectToJson(list);
			jediscluster.GetList().get((Index++)%5).hset("cache","BlogList", result);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
