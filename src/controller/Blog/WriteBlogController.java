package controller.Blog;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.TbBlogartical;
import service.WriteBlog;
/**
 * 
* <p>Title: WriteBlogController.java<／p>
* <p>Description: 写博客Controller <／p>
* <p>Copyright: Copyright (c) 2007<／p>
* @author Ma
* @date 2019年5月20日
 */
@Controller
public class WriteBlogController {
	@Autowired
	private WriteBlog service;
	
	@RequestMapping("/Write")
	public String Write(String UserNumber,String UserName,String content,String title,ModelMap model) throws Exception{
		
		TbBlogartical Artical = new TbBlogartical();
		
		Artical.setBlogtitle(title);
		Artical.setBlogcontent(content);
		Artical.setBlogtraffic(0);
		Artical.setBlogusernumber(UserNumber);
		Date utilDate  =new Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	    Artical.setBlogdata(sqlDate);	    	    					
		int total = service.InsertBlog(Artical);		
		if(total>0) {
			model.put("UserNumber",UserNumber);
			model.put("UserName",UserName);
			return "Blog/WriteBlogSuccess";
		} else {
			return "Blog/WriteBlog";
		}
	}	
	@RequestMapping("/WriteBlog")
	public String Jump(@RequestParam(value="UserNumber",defaultValue = "0") String Number,String UserName,ModelMap model) {
		//System.out.println(Number);
		if("0".equals(Number)) {
			return "redirect:/Login";
		}		
		model.put("UserNumber", Number);
		model.put("UserName", UserName);
		return "Blog/WriteBlog";
	}
}
