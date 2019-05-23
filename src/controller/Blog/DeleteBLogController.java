package controller.Blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.DeleteBlog;

@Controller
public class DeleteBLogController {
	@Autowired
	private DeleteBlog service;
	@RequestMapping("/DeleteBlog")
	public String deleteblog(ModelMap model,Integer BlogId,String UserNumber,String UserName) throws Exception{
		
		int total = service.Deleteblog(BlogId);		
		return "redirect:/UserBlog/"+UserNumber+"?UserName="+UserName+"&page=1";
		
	}
}
