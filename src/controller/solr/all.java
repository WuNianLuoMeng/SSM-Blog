package controller.solr;


import java.util.List;

import org.apache.solr.client.solrj.SolrServer;

import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.TbBlogartical;
import service.All;
@Controller
public class all {
	@Autowired
	private SolrServer solrserver;
	@Autowired
	private All Service;
	@RequestMapping("/all")
	public String allblog() throws Exception{
		
		List<TbBlogartical> list = Service.qury();
		for(TbBlogartical x:list) {
			SolrInputDocument document = new SolrInputDocument();
	        //添加域
	        document.addField("id", x.getBlogid());
	        document.addField("title",x.getBlogtitle());
	        //写入索引库
	        solrserver.add(document);
		}
		solrserver.commit();
		return "redirect:/Login";
	}
}
