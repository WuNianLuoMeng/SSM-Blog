package serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.naming.directory.SearchResult;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.BlogPoJo;
import pojo.TbBlogartical;
import service.SearchBlog;

/**
 * 
* <p>Title: SearchBlogImpl.java<／p>
* <p>Description: 查询博客<／p>
* @author Ma
* @date 2019年5月25日
 */
@Service
public class SearchBlogImpl implements SearchBlog{
	@Autowired
	private SolrServer solrserver;
	@Override
	public BlogPoJo searchblog(String query, Integer Page) throws Exception {
		
		//生成查询对象
		SolrQuery Query = new SolrQuery();
		//设置查询条件
		Query.setQuery("title:"+query);
		Query.setStart((Page-1)*10);
		Query.setRows(10);
		//设置高亮显示
		Query.setHighlight(true);
		Query.addHighlightField("title");
		Query.setHighlightSimplePre("<em style=\"color:red\">");
		Query.setHighlightSimplePost("</em>");
		//执行查询
		QueryResponse result = solrserver.query(Query);		
		SolrDocumentList list = result.getResults();		
		//获取高亮字段
		Map<String,Map<String,List<String>>> highlightMap=result.getHighlighting();
		//迭代器
		Iterator<SolrDocument> iter = list.iterator();
		
		//返回结果
		List<TbBlogartical> ans = new ArrayList<>();
//		System.out.println("查询的总数"+list.getNumFound());
		while(iter.hasNext()) {
			TbBlogartical index = new TbBlogartical();
			SolrDocument doc = iter.next();
			String Id=doc.getFieldValue("id").toString();
			int id = Integer.parseInt(Id);
			String title = doc.getFieldValue("title").toString();
			//设置每个结果的博客Id，标题
			index.setBlogid(id);
			index.setBlogtitle(title);
			
			List<String> titleList=highlightMap.get(Id).get("title");
            //获取并设置高亮的字段title
            if(titleList!=null && titleList.size()>0){
                index.setBlogtitle(titleList.get(0));
            }            
            //添加到返回结果当中
            ans.add(index);
		}
		BlogPoJo res = new BlogPoJo();
		res.setList(ans);
		res.setSum(list.getNumFound());
		return res;

	}
	
}
