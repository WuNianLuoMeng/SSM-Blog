package controller.personal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.TbBloguser;
import service.UserInfo;
/**
 * 
* <p>Title: PersonMessage.java<／p>
* <p>Description: 用于进入到个人主页信息<／p>
* @author Ma
* @date 2019年5月13日
 */
@Controller
public class PersonMessage {
	@Autowired
	private UserInfo service;
	@RequestMapping("/Detail/{UserNumber}")
	public String personmessage(@PathVariable String UserNumber,ModelMap model) throws Exception {
		
		//根据用户的usernumber来查询用户信息		
		TbBloguser User = service.GetUserInfo(UserNumber);
		
		//将信息添加到model中
		model.put("UserName", User.getBlogusername());
		model.put("UserNumber", User.getBlogusernumber());
		
		return "forward:/WEB-INF/jsp/User/UserInfo.jsp";
	}
	
}
