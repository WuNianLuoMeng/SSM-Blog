package controller.Blog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.BlogPoJo;
import service.SearchBlog;

@Controller
public class SearchBlogController {
	@Autowired
	private SearchBlog service;
	@RequestMapping("/Search")
	public String searchblog(@RequestParam(value = "page", defaultValue = "1") Integer page,ModelMap model,String content,String UserName,String BlogUserName,String UserNumber) throws Exception {
		BlogPoJo result = service.searchblog(content, page);  					
		if(page-1!=0) {
			model.put("ProPage",page-1);
		} else {
			model.put("ProPage",page);
		}
		if((page-1)*10+result.getList().size()==result.getSum()){
			model.put("NextPage",page);
		} else {
			model.put("NextPage",page+1);
		}
		model.put("BlogUserName",BlogUserName);
		model.put("content",content);		
		model.put("Data", result.getList());		
		model.put("UserName", UserName);
		model.put("UserNumber", UserNumber);						
		return "User/UserSearchBlog";
	}
	
	
}
