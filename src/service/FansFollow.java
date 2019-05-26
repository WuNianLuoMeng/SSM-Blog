package service;


import com.github.pagehelper.PageInfo;

import pojo.TbFans;
public interface FansFollow {
	PageInfo<TbFans> GetFans(String UserNumber,Integer page) throws Exception;
	PageInfo<TbFans> GetFollow(String UserNumber,Integer page) throws Exception;
}
