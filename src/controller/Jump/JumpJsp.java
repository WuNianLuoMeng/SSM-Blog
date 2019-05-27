package controller.Jump;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import mapper.TbBloguserMapper;
import pojo.MyTbBlogartical;
import pojo.TbBlogartical;
import pojo.TbBloguser;
import pojo.TbHome;
import service.BlogInfo;
import service.home;

/**
 * 
 * <p>
 * Title: JumpJsp.java<p>
 * <p>
 * Description: Controller <p>
 * <p>
 * Copyright: Copyright (c) 2007<p>
 * 
 * @author Ma
 */
@Controller
public class JumpJsp {
	@Autowired
	TbBloguserMapper mapper;
	@Autowired
	BlogInfo BlogService;
	@Autowired
	home mainservice;
	@RequestMapping("/Home")
	public String JumpHome(String UserNumber, ModelMap model) throws Exception {
		/* 跳转到home界面 */
		List<TbHome> list=mainservice.GetBlogList();
		model.put("Data",list);
		TbBloguser user = mapper.selectByPrimaryKey(UserNumber);
		model.put("UserName", user.getBlogusername());
		model.put("UserNumber", UserNumber);					
		return "forward:/home.jsp";
	}

	@RequestMapping("/home")
	public String JumpLogin(ModelMap model) throws Exception {
		
		List<TbHome> list=mainservice.GetBlogList();
		
//		for(TbHome x:list) {
//			System.out.println(x.getBlogtitle());
//		}
		model.put("Data",list);
		return "forward:/home.jsp";
	}
	@RequestMapping("/")
	public String Jumphome(ModelMap model) throws Exception {
		
		return "redirect:/home";
	}
	@RequestMapping("/UserBlog/{UserNumber}")
	public String JumpUserBlog(@PathVariable String UserNumber,String UserName,ModelMap model,@RequestParam(value="page",defaultValue = "1") int page) throws Exception{
		
		
		MyTbBlogartical result = BlogService.GetBlogInfo(UserNumber,page);
		List<TbBlogartical> list = result.getBloglist().getList();
		model.put("UserNumber",UserNumber);		
		model.put("UserName",UserName);
		model.put("BlogUserNumber",UserNumber);
		model.put("BlogUserName",UserName);
		if(page-1!=0) {
			model.put("ProPage",page-1);
		} else {
			model.put("ProPage",page);
		}
		if((page-1)*10+list.size()==result.getBloglist().getTotal()){
			model.put("NextPage",page);
		} else {
			model.put("NextPage",page+1);
		}
		model.put("Data",list);
		model.put("FansNum",result.getFansnum());
		model.put("FollowNum",result.getFollownum());
		return "User/UserBlog";
	}
	
}
