package service;

import pojo.TbBloguser;

public interface UserInfo {
	TbBloguser GetUserInfo(String number) throws Exception;
	void changemessage(TbBloguser user) throws Exception;
}
