package controller.Blog;

import java.util.Date;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
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
	@Autowired
	private SolrServer solrserver;
	@RequestMapping("/SaveBlog")
	public String SaveBlog(String BlogUserName,String UserNumber,String UserName,String title,String content,Integer BlogId,Integer blogtraffic,ModelMap model) throws Exception {
		
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
			//修改文章之后要对solr进行更新
			SolrInputDocument document = new SolrInputDocument();
	        //添加域
	        document.addField("id", blog.getBlogid());
	        document.addField("title",blog.getBlogtitle());
	        //写入索引库
	        solrserver.add(document);
	        //提交
	        solrserver.commit();
	        
	        model.put("UserName",UserName);
			model.put("BlogUserName",BlogUserName);
			model.put("page",1);
			return "redirect:/UserBlog/"+UserNumber;	
		} else {
			model.put("BlogId",BlogId);
			model.put("UserName",UserName);
			return "redirect:/EditBLog";
		}
	}
}
