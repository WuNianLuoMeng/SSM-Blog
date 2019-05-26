package controller.personal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddFollow {
	@RequestMapping("/AddFollow")
	public String AddFollow(ModelMap model,String first,String first_name,String second,String second_name) {
		
		
		
		return "User/UserBlog";
	}
}
