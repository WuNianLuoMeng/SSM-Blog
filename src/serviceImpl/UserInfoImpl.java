package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBloguserMapper;
import pojo.TbBloguser;
import service.UserInfo;
/**
 * 
* <p>Title: UserInfoImpl.java<／p>
* <p>Description: 获取用户信息的Service <／p>
* <p>Copyright: Copyright (c) 2007<／p>
* @author Ma
* @date 2019年5月19日
 */
@Service
public class UserInfoImpl implements UserInfo {
	
	@Autowired
	private TbBloguserMapper mapper;

	@Override
	public TbBloguser GetUserInfo(String number) throws Exception {
		
		//根据用户的number查询用户的信息
		TbBloguser UserInfo = mapper.selectByPrimaryKey(number);					
		return UserInfo;
	}

	@Override
	public void changemessage(TbBloguser user) throws Exception {
		// TODO Auto-generated method stub		
		mapper.updateByPrimaryKeySelective(user);
	}

}
