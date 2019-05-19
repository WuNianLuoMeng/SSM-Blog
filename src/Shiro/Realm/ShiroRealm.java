package Shiro.Realm;


import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.spi.LoggerFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBloguserMapper;
import pojo.TbBloguser;
/**
 * 
* <p>Title: ShiroRealm.java<／p>
* <p>Description: 用户登录验证 <／p>
* <p>Copyright: Copyright (c) 2007<／p>
* <p>Company: LTGames<／p>
* @author Ma
* @date 2019年5月11日
 */
@Service
public class ShiroRealm extends AuthorizingRealm {
	@Autowired
	private TbBloguserMapper mapper;
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//		System.out.println("1");
		//1,类型的转换
		UsernamePasswordToken Token = (UsernamePasswordToken) token;
		//2，从这个中获取number
		String number = Token.getUsername();
		//System.out.println(Token.getPassword());
		//3，依据number从数据库中查询数据
		
		TbBloguser result= mapper.selectByPrimaryKey(number);
		if(result==null) {
			throw new UnknownAccountException("用户名不存在");
		}
		//静态模拟添加用户
		//1，认证的实体信息
		Object principal = number;
		//2，密码
		String hashedCredentials = result.getBloguserpassword();
		//3,当前Realm的名字
		String realmName = getName();
		//设置盐值
		ByteSource credentialsSalt = ByteSource.Util.bytes(number);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, hashedCredentials, credentialsSalt, realmName);
		//System.out.println(info.getCredentials());
		return info;
	}
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("asd");
		String usernumber = (String) principals.getPrimaryPrincipal();
		Set<String> roles = new HashSet<>();
		if(usernumber!="") {
			roles.add("user");
		}
		if("1234".equals(usernumber)) {
			roles.add("admin");
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles); 		
		return info;
	}

}
