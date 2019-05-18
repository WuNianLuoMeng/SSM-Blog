package controller.personal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChangeMessage {
	@RequestMapping("/ChangeMessage")					  
	public String changemessage() {
		
		return "redirect:home.jsp";
	}
}
