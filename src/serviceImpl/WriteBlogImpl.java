package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import pojo.TbBlogartical;
import service.WriteBlog;
@Service
public class WriteBlogImpl implements WriteBlog{
	@Autowired
	private TbBlogarticalMapper mapper;
	@Override
	public int InsertBlog(TbBlogartical Artical) throws Exception {
		int total=mapper.insert(Artical);
		return total;
	}

}
