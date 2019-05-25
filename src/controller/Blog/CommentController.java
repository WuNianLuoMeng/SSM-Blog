package controller.Blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.TbComment;
import service.AddComment;

@Controller
public class CommentController {
	@Autowired
	private AddComment service;
	@RequestMapping("/SubmitCommit")
	public String submitcommit(ModelMap model,Integer blogid,String comment,String firstusername,String firstusernumber,String secondusername,String secondusernumber,Integer flog) throws Exception {
		
		TbComment Comment = new TbComment();
		Comment.setCommentContent(comment);
		Comment.setBlogid(blogid);
		Comment.setFirstname(firstusername);
		Comment.setFirstnumber(firstusernumber);
		Comment.setSecondname(secondusername);
		Comment.setSecondnumber(secondusernumber);
		Comment.setFlog(flog);
		int total = service.addcomment(Comment);
		model.put("BlogId",blogid);		
		model.put("UserNumber",firstusernumber);
		model.put("UserName",firstusername);
		return "redirect:/LookBlog";
	}	
}
