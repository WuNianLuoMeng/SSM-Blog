package service;

import pojo.TbBloguser;

public interface UserInfo {
	TbBloguser GetUserInfo(String number) throws Exception;
}
