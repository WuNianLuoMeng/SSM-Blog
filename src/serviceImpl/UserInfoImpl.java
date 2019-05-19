package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBloguserMapper;
import pojo.TbBloguser;
import service.UserInfo;
/**
 * 
* <p>Title: UserInfoImpl.java<��p>
* <p>Description: ��ȡ�û���Ϣ��Service <��p>
* <p>Copyright: Copyright (c) 2007<��p>
* @author Ma
* @date 2019��5��19��
 */
@Service
public class UserInfoImpl implements UserInfo {
	
	@Autowired
	private TbBloguserMapper mapper;

	@Override
	public TbBloguser GetUserInfo(String number) throws Exception {
		
		//�����û���number��ѯ�û�����Ϣ
		TbBloguser UserInfo = mapper.selectByPrimaryKey(number);					
		return UserInfo;
	}

	@Override
	public void changemessage(TbBloguser user) throws Exception {
		// TODO Auto-generated method stub		
		mapper.updateByPrimaryKeySelective(user);
	}

}
