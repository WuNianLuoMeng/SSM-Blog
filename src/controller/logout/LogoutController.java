package controller.logout;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {
	@RequestMapping("/Logout")
	public String Logout() {

		// ThreadContext.remove(ThreadContext.SUBJECT_KEY);//移除线程中的subject

//		ThreadContext.remove(ThreadContext.SUBJECT_KEY);
//		ThreadContext.getSecurityManager().logout(ThreadContext.getSubject());
		return "redirect:/Login";
	}

}
