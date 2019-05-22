package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import mapper.TbBlogarticalMapper;
import pojo.TbBlogartical;
import pojo.TbBlogarticalExample;
import pojo.TbBlogarticalExample.Criteria;
import service.BlogInfo;
/**
 * 
* <p>Title: BlogInfoImpl.java<／p>
* <p>Description: 查询用户的博客内容<／p>
* @author Ma
* @date 2019年5月22日
 */
@Service
public class BlogInfoImpl implements BlogInfo {
	@Autowired
	private TbBlogarticalMapper mapper;

	@Override
	public PageInfo<TbBlogartical> GetBlogInfo(String UserNumber,int page) throws Exception {
		// TODO Auto-generated method stub
		
		TbBlogarticalExample example=new TbBlogarticalExample();
		Criteria criteria =example.createCriteria();
		/*创建查询条件*/		
		criteria.andBlogusernumberEqualTo(UserNumber);
		//分页处理
		PageHelper.startPage(page, 10);
		List<TbBlogartical> list = mapper.selectByExample(example);
		PageInfo<TbBlogartical> pageinfo = new PageInfo<TbBlogartical>(list);
//		System.out.println(pageinfo.getTotal());
		return pageinfo;
	}

}
