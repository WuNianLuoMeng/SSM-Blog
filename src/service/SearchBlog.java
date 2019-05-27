package service;




import pojo.BlogPoJo;



public interface SearchBlog {
	BlogPoJo searchblog(String query,Integer Page) throws Exception;
}
