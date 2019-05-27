package service;

import java.util.List;

import pojo.TbFans;

public interface GetFollowNum {
	Integer getfollow(String UserNumber) throws Exception;
	boolean isfollow(String UserNumber, String BlogUserNumber) throws Exception;
	List<TbFans> getfollowlist(String UserNumber) throws Exception;
}
