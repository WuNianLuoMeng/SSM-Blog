package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import pojo.TbBlogartical;
import service.SaveBlog;
@Service
public class SaveBlogImpl implements SaveBlog {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Override
	public int UpDateBlog(TbBlogartical blog) throws Exception {
		// TODO Auto-generated method stub
		
		int total = mapper.updateByPrimaryKey(blog);
		
		return total;
	}

}
