package Shiro.Config;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

/**
 * @Auther: lanhaifeng
 * @Date: 2019/4/18 0018 17:40
 * @Description:支持多角色验证
 * 由于Shiro filterChainDefinitions中 roles默认是and，
 * = user,roles[system,general]
 * 比如：roles[system,general] ，表示同时需要“system”和“general” 2个角色才通过认证
 * 但是在实际业务中，一个端口的权限往往对多个角色开放（比如管理员可以使用一切权利）
 */


public class AdminAuthenticationFilter extends FormAuthenticationFilter {
	@Override
		protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
			if(isLoginRequest(request, response) && isLoginSubmission(request, response)){  
		        return false;
		    } 
			return super.isAccessAllowed(request, response, mappedValue);
		}
	}
