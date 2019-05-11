package Shiro.Realm;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBloguserMapper;
import pojo.TbBloguser;
/**
 * 
* <p>Title: ShiroRealm.java<��p>
* <p>Description: �û���¼��֤ <��p>
* <p>Copyright: Copyright (c) 2007<��p>
* <p>Company: LTGames<��p>
* @author Ma
* @date 2019��5��11��
 */
@Service
public class ShiroRealm extends AuthenticatingRealm {
	@Autowired
	private TbBloguserMapper mapper;
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		//1,���͵�ת��
		UsernamePasswordToken Token = (UsernamePasswordToken) token;
		//2��������л�ȡnumber
		String number = Token.getUsername();
		//System.out.println(Token.getPassword());
		//3������number�����ݿ��в�ѯ����
		
		TbBloguser result= mapper.selectByPrimaryKey(number);
		if(result==null) {
			throw new UnknownAccountException("�û���������");
		}
		//��̬ģ������û�
		//1����֤��ʵ����Ϣ
		Object principal = number;
		//2������
		String hashedCredentials = result.getBloguserpassword();
		//3,��ǰRealm������
		String realmName = getName();
		//������ֵ
		ByteSource credentialsSalt = ByteSource.Util.bytes(number);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, hashedCredentials, credentialsSalt, realmName);
		System.out.println(info.getCredentials());
		return info;
	}

	
	
	
	

}
