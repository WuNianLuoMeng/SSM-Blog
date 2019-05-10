package Shiro.Realm;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
/**
 * 
* <p>Title: ShiroRealm.java<／p>
* <p>Description: 用户登录验证 <／p>
* <p>Copyright: Copyright (c) 2007<／p>
* <p>Company: LTGames<／p>
* @author Ma
* @date 2019年5月11日
 */
public class ShiroRealm extends AuthenticatingRealm {

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		//1,类型的转换
		UsernamePasswordToken Token = (UsernamePasswordToken) token;
		//2，从这个中获取number
		String number = Token.getUsername();
		System.out.println(number);
		//3，依据number从数据库中查询数据
		
		
		//静态模拟添加用户
		//1，认证的实体信息
		Object principal = number;
		//2，密码
		String credentials = "123456";
		//3,当前Realm的名字
		String realmName = getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, realmName);
		//4，进行检测，看用户是否存在				
		return info;
	}

	
	
	
	

}
