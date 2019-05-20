package controller.Jump;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.TbBloguserMapper;
import pojo.TbBloguser;

/**
 * 
 * <p>
 * Title: JumpJsp.java<／p>
 * <p>
 * Description: 负责中间页面跳转的Controller <／p>
 * <p>
 * Copyright: Copyright (c) 2007<／p>
 * 
 * @author Ma
 * @date 2019年5月19日
 */
@Controller
public class JumpJsp {
	@Autowired
	TbBloguserMapper mapper;

	@RequestMapping("/Home")
	public String JumpHome(String UserNumber, ModelMap model) {
		/* 获取用户信息 */
		TbBloguser user = mapper.selectByPrimaryKey(UserNumber);
		model.put("UserName", user.getBlogusername());
		model.put("UserNumber", UserNumber);
		return "forward:/home.jsp";
	}

	@RequestMapping("/")
	public String JumpLogin() {
		return "redirect:/Login";
	}
//	@RequestMapping("/test")
//	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
//		resp.sendRedirect("home.jsp");
//	}
}
