package test;


import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.util.*;
import org.junit.Test;

public class test_solr {
	@Test
	public void test() throws Exception{
		
		
		SolrServer solrServer = new HttpSolrServer("http://localhost:8983/solr/mycore");
		SolrInputDocument document = new SolrInputDocument();
        //添加域
        document.addField("id", "003");
        document.addField("title","C");
        //写入索引库
        solrServer.add(document);
        solrServer.deleteById("001");
		solrServer.commit();
	}
}
