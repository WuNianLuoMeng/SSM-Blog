package controller.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {
	@RequestMapping("/Login")
	public String Login() {
		return "Login/Login";
	}
	
}
