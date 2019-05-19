package controller.Jump;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.TbBloguserMapper;
import pojo.TbBloguser;
/**
 * 
* <p>Title: JumpJsp.java<��p>
* <p>Description: �����м�ҳ����ת��Controller <��p>
* <p>Copyright: Copyright (c) 2007<��p>
* @author Ma
* @date 2019��5��19��
 */
@Controller
public class JumpJsp {
	@Autowired
	TbBloguserMapper mapper;
	@RequestMapping("/Home")
	public String JumpHome(String UserNumber,ModelMap model) {
		/*��ȡ�û���Ϣ*/
		TbBloguser user = mapper.selectByPrimaryKey(UserNumber);
		model.put("UserName", user.getBlogusername());
		model.put("UserNumber", UserNumber);	
		return "forward:/home.jsp";
	}
	@RequestMapping("/")
	public String JumpLogin() {
		return "redirect:/Login";
	}
}
