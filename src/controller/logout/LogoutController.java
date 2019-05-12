package controller.logout;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.support.DelegatingSubject;
import org.apache.shiro.util.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Shiro.Realm.ShiroRealm;
import net.sf.ehcache.*;

@Controller
public class LogoutController {
	@Autowired
	private ShiroRealm myRealm;
	@RequestMapping("/Logout")
	public String Logout(HttpSession session) {	
		return "redirect:/Login";
	}
	
}
