package controller.logout;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {
	@RequestMapping("/Logout")
	public String Logout() {

		// ThreadContext.remove(ThreadContext.SUBJECT_KEY);//�Ƴ��߳��е�subject

//		ThreadContext.remove(ThreadContext.SUBJECT_KEY);
//		ThreadContext.getSecurityManager().logout(ThreadContext.getSubject());
		return "redirect:/Login";
	}

}
