package service;


import com.github.pagehelper.PageInfo;

import pojo.TbBlogartical;

public interface BlogInfo {
	PageInfo<TbBlogartical> GetBlogInfo(String UserNumber,int page) throws Exception;
}
