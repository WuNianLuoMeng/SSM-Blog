package service;

import com.github.pagehelper.PageInfo;

import pojo.TbBlogartical;

public interface AllBlog {
	PageInfo<TbBlogartical> GetAllBlog(Integer page) throws Exception;
}
