package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import pojo.TbBlogartical;
import service.EditBlog;

/**
 * 
* <p>Title: EditBlogImpl.java<／p>
* <p>Description: 获取到所要编辑的文章信息<／p>  
* @author Ma
* @date 2019年5月23日
 */
@Service
public class EditBlogImpl implements EditBlog {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Override
	public TbBlogartical GetBlogInfo(Integer id) throws Exception {
		
		TbBlogartical blog = mapper.selectByPrimaryKey(id);
		
		
		return blog;
	}

}
