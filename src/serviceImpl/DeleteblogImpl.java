package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import service.DeleteBlog;
@Service
public class DeleteblogImpl implements DeleteBlog {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Override
	public int Deleteblog(Integer id) throws Exception {
		
		int total = mapper.deleteByPrimaryKey(id);
		
		
		return total;
	}

}
