package controller.Blog;

import org.apache.solr.client.solrj.SolrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import service.DeleteBlog;

@Controller
public class DeleteBLogController {
	@Autowired
	private DeleteBlog service;
	@Autowired
	private SolrServer solrserver;
	@RequestMapping("/DeleteBlog")	
	public String deleteblog(ModelMap model,Integer BlogId,String BlogUserName,String UserNumber,String UserName) throws Exception{
		
		int total = service.Deleteblog(BlogId);
		//当删除博客的时候，还要维护solr索引
		if(total>0) {
			solrserver.deleteById(BlogId+"");
			solrserver.commit();
		}			
		model.put("UserName",UserName);
		model.put("BlogUserName",BlogUserName);
		model.put("page",1);
		return "redirect:/UserBlog/"+UserNumber;		
	}
}
