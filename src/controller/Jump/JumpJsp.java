package controller.Jump;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;


import mapper.TbBloguserMapper;
import pojo.TbBlogartical;
import pojo.TbBloguser;
import service.BlogInfo;

/**
 * 
 * <p>
 * Title: JumpJsp.java<��p>
 * <p>
 * Description: Controller <��p>
 * <p>
 * Copyright: Copyright (c) 2007<��p>
 * 
 * @author Ma
 */
@Controller
public class JumpJsp {
	@Autowired
	TbBloguserMapper mapper;
	@Autowired
	BlogInfo BlogService;
	@RequestMapping("/Home")
	public String JumpHome(String UserNumber, ModelMap model) {
		/* 跳转到home界面 */
		TbBloguser user = mapper.selectByPrimaryKey(UserNumber);
		model.put("UserName", user.getBlogusername());
		model.put("UserNumber", UserNumber);
		return "forward:/home.jsp";
	}

	@RequestMapping("/")
	public String JumpLogin() {
		return "redirect:/Login";
	}
	@RequestMapping("/UserBlog/{UserNumber}")
	public String JumpUserBlog(@PathVariable String UserNumber,String UserName,ModelMap model,@RequestParam(value="page",defaultValue = "1") int page) throws Exception{
		PageInfo<TbBlogartical> result = BlogService.GetBlogInfo(UserNumber,page);
		List<TbBlogartical> list = result.getList();
		model.put("UserNumber",UserNumber);
		model.put("UserName",UserName);
		if(page-1!=0) {
			model.put("ProPage",page-1);
		} else {
			model.put("ProPage",page);
		}
		if((page-1)*10+list.size()==result.getTotal()){
			model.put("NextPage",page);
		} else {
			model.put("NextPage",page+1);
		}
		model.put("Data",list);
		return "User/UserBlog";
	}
	
}
