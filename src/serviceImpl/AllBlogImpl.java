package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import mapper.TbBlogarticalMapper;
import pojo.TbBlogartical;
import pojo.TbBlogarticalExample;

import service.AllBlog;
@Service
public class AllBlogImpl implements AllBlog {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Override
	public PageInfo<TbBlogartical> GetAllBlog(Integer page) throws Exception {
		
		
		TbBlogarticalExample example = new TbBlogarticalExample();		
		PageHelper.startPage(page, 10);
		List<TbBlogartical> list = mapper.selectByExample(example);
		PageInfo<TbBlogartical> pageinfo = new PageInfo<TbBlogartical>(list);		
		return pageinfo;
		
		
	}

}
