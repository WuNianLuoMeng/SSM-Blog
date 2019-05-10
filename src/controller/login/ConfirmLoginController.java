package controller.login;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfirmLoginController {
	@RequestMapping("/login")
	public String LoginConfirm(String number, String password) {
		// System.out.println(number+"/"+password);
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(number, password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);				
			} catch (AuthenticationException ae) {
				System.out.println("µÇÂ½Ê§°Ü£¡£¡£¡");
				return "redirect:/Login";
			}
		}
		return "redirect:/Test.jsp";
		
	}
}
