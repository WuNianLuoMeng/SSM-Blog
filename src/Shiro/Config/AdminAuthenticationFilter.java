package Shiro.Config;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

/**
 * @Auther: lanhaifeng
 * @Date: 2019/4/18 0018 17:40
 * @Description:֧�ֶ��ɫ��֤
 * ����Shiro filterChainDefinitions�� rolesĬ����and��
 * = user,roles[system,general]
 * ���磺roles[system,general] ����ʾͬʱ��Ҫ��system���͡�general�� 2����ɫ��ͨ����֤
 * ������ʵ��ҵ���У�һ���˿ڵ�Ȩ�������Զ����ɫ���ţ��������Ա����ʹ��һ��Ȩ����
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
