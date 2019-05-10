package Shiro.Config;

import org.apache.shiro.web.filter.mgt.FilterChainResolver;
import org.apache.shiro.web.mgt.WebSecurityManager;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


/**
 * 
* <p>Title: MySpringShiroFilter.java<£¯p>
* <p>Description: <£¯p>
* <p>Copyright: Copyright (c) 2007<£¯p>
* <p>Company: LTGames<£¯p>
* @author Ma
* @date 2019Äê5ÔÂ11ÈÕ
 */
public class MySpringShiroFilter extends AbstractShiroFilter {
    protected MySpringShiroFilter(WebSecurityManager webSecurityManager, FilterChainResolver resolver) {
        super();
        if (webSecurityManager == null) {
            throw new IllegalArgumentException("WebSecurityManager property cannot be null.");
        }
        setSecurityManager(webSecurityManager);
        if (resolver != null) {
            setFilterChainResolver(resolver);
        }
    }

    @Override
    protected ServletResponse wrapServletResponse(HttpServletResponse orig, ShiroHttpServletRequest request) {
        return new MyShiroHttpServletResponse(orig, getServletContext(), request);
    }
}