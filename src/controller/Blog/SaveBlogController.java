package controller.Blog;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.TbBlogartical;
import service.SaveBlog;
/**
 * 
* <p>Title: SaveBlogController.java<／p>
* <p>Description: 保存修改后的博客信息 <／p>
* @author Ma
* @date 2019年5月23日
 */
@Controller
public class SaveBlogController {
	@Autowired
	private SaveBlog service;
	@RequestMapping("/SaveBlog")
	public String SaveBlog(String UserNumber,String UserName,String title,String content,Integer BlogId,Integer blogtraffic,ModelMap model) throws Exception {
		
		TbBlogartical blog = new TbBlogartical(); 
		blog.setBlogid(BlogId);
		blog.setBlogcontent(content);
		blog.setBlogtitle(title);
		blog.setBlogtraffic(blogtraffic);
		blog.setBlogusernumber(UserNumber);
		Date utilDate  =new Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());	      	    				
		blog.setBlogdata(sqlDate);						
		int total = service.UpDateBlog(blog);		
		if(total>0){		
			return "redirect:/UserBlog/"+UserNumber+"?UserName="+UserName+"&page=1";
		} else {
			model.put("BlogId",BlogId);
			model.put("UserName",UserName);
			return "redirect:/EditBLog";
		}
	}
}
