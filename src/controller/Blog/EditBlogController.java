package controller.Blog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.TbBlogartical;
import service.EditBlog;
/**
 * 
* <p>Title: EditBlogController.java<／p>
* <p>Description:获取博客信息，并跳转编辑博客界面 <／p>
* @author Ma
* @date 2019年5月23日
 */
@Controller
public class EditBlogController {
	@Autowired
	private EditBlog service;

	@RequestMapping("/EditBLog")
	public String EditBlog(String UserNumber,String BlogUserName,Integer BlogId,String UserName,ModelMap model) throws Exception{
		//System.out.println(BlogId);
		
		TbBlogartical blog = service.GetBlogInfo(BlogId);
		
		
		model.put("BlogId",BlogId);
		model.put("BlogTitle",blog.getBlogtitle());
		model.put("BlogContent",blog.getBlogcontent());
		model.put("UserNumber",blog.getBlogusernumber());
		model.put("Blogtraffic",blog.getBlogtraffic());
		model.put("UserName",UserName);
		model.put("BlogUserName",BlogUserName);

		
		return "Blog/EditBlog";
	}
}
