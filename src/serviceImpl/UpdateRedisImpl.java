package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import mapper.TbHomeMapper;
import pojo.TbBlogartical;
import pojo.TbHome;
import pojo.TbHomeExample;
import service.UpdateRedis;
@Service
public class UpdateRedisImpl implements UpdateRedis {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Autowired
	private TbHomeMapper HomeMapper;
	@Override
	public void updateredis() throws Exception {
		//获取访问量前10的博客文章
		System.out.println(mapper);
		List<TbBlogartical> list = mapper.MySelect();
//		System.out.println(list.size());
		/*删除热门博客中的所有记录*/
		TbHomeExample example = new TbHomeExample();
		HomeMapper.deleteByExample(example);
		/*然后将前10的博客写入到热门博客的表当中*/
		for(TbBlogartical x:list) {
			TbHome a = new TbHome();
			a.setBlogcontent(x.getBlogcontent());
			a.setBlogdata(x.getBlogdata());
			a.setBlogid(x.getBlogid());
			a.setBlogtitle(x.getBlogtitle());
			a.setBlogtraffic(x.getBlogtraffic());
			a.setBlogusernumber(x.getBlogusernumber());
			HomeMapper.insert(a);
		}
	}
}
