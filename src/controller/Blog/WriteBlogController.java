package controller.Blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WriteBlogController {
	@RequestMapping("/WriteBlog")
	public String Jump() {
		return "Blog/WriteBlog";
	}
}
