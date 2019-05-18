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
* <p>Title: PersonMessage.java<��p>
* <p>Description: ���ڽ��뵽������ҳ��Ϣ<��p>
* @author Ma
* @date 2019��5��13��
 */
@Controller
public class PersonMessage {
	@Autowired
	private UserInfo service;
	@RequestMapping("/Detail/{UserNumber}")
	public String personmessage(@PathVariable String UserNumber,ModelMap model) throws Exception {
		
		//�����û���usernumber����ѯ�û���Ϣ		
		TbBloguser User = service.GetUserInfo(UserNumber);
		
		//����Ϣ��ӵ�model��
		model.put("UserName", User.getBlogusername());
		model.put("UserNumber", User.getBlogusernumber());
		
		return "forward:/WEB-INF/jsp/User/UserInfo.jsp";
	}
	
}
