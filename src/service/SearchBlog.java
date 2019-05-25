package service;


import java.util.List;

import pojo.BlogPoJo;
import pojo.TbBlogartical;


public interface SearchBlog {
	BlogPoJo searchblog(String query,Integer Page) throws Exception;
}
