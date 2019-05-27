package controller.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.MyFansPOJO;

import service.Recommend;

import java.util.List;
@Controller
public class RecommendController {
	@Autowired
	private Recommend service;
	@RequestMapping("/Recommend/{UserNumber}")
	public String recommend(@PathVariable String UserNumber,String UserName,ModelMap model) throws Exception{
		
		List<MyFansPOJO> list =service.GetRecommend(UserNumber);
		model.put("Data",list);
		model.put("Sum",list.size());
		model.put("UserName",UserName);
		model.put("UserNumber",UserNumber);		
		return "User/UserRecommend";
	}
	
}
