package service;

import java.util.List;

import pojo.TbBlogartical;
import pojo.TbComment;

public interface LookBlog {
	TbBlogartical GetBlog(Integer id) throws Exception;
	List<TbComment> GetBlogComment(Integer BlogId) throws Exception;
}
