package Shiro.Realm;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
/**
 * 
* <p>Title: ShiroRealm.java<��p>
* <p>Description: �û���¼��֤ <��p>
* <p>Copyright: Copyright (c) 2007<��p>
* <p>Company: LTGames<��p>
* @author Ma
* @date 2019��5��11��
 */
public class ShiroRealm extends AuthenticatingRealm {

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		//1,���͵�ת��
		UsernamePasswordToken Token = (UsernamePasswordToken) token;
		//2��������л�ȡnumber
		String number = Token.getUsername();
		System.out.println(number);
		//3������number�����ݿ��в�ѯ����
		
		
		//��̬ģ������û�
		//1����֤��ʵ����Ϣ
		Object principal = number;
		//2������
		String credentials = "123456";
		//3,��ǰRealm������
		String realmName = getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, realmName);
		//4�����м�⣬���û��Ƿ����				
		return info;
	}

	
	
	
	

}
