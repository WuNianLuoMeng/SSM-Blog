package controller.Blog;

import java.util.Date;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.TbBlogartical;
import service.WriteBlog;
/**
 * 
* <p>Title: WriteBlogController.java<��p>
* <p>Description: 写博客Controller <��p>
* <p>Copyright: Copyright (c) 2007<��p>
* @author Ma
* @date 2019年5月20日
 */
@Controller
public class WriteBlogController {
	@Autowired
	private WriteBlog service;
	@Autowired
	private SolrServer solrserver;
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
//		System.out.println("*****"+Artical.getBlogid());
		if(total>0) {
			model.put("UserNumber",UserNumber);
			model.put("UserName",UserName);
			//添加文章之后要对solr进行更新
			SolrInputDocument document = new SolrInputDocument();
	        //添加域
	        document.addField("id", Artical.getBlogid());
	        document.addField("title",Artical.getBlogtitle());
	        //写入索引库
	        solrserver.add(document);
	        //提交
	        solrserver.commit();
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
