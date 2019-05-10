package controller.registe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistePage {
	@RequestMapping("/Registe")
	public String Registe() {
		return "Login/Registe";
	}
	
}
