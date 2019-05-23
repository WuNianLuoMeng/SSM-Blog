package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import pojo.TbBlogartical;
import service.LookBlog;
@Service
public class LookBlogImpl implements LookBlog {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Override
	public TbBlogartical GetBlog(Integer id) throws Exception {
		
		TbBlogartical blog = mapper.selectByPrimaryKey(id);
		
		
		return blog;
	}

}
