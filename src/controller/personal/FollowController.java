package controller.personal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import pojo.TbFans;
import service.FansFollow;
/**
 * 
* <p>Title: FansController.java<／p>
* <p>Description: 粉丝列表controller<／p>
* @author Ma
* @date 2019年5月26日
 */
@Controller
public class FollowController {
	@Autowired
	private FansFollow FansService;
	@RequestMapping("/follow/{UserNumber}")
	private String fans(@PathVariable String UserNumber,String UserName,ModelMap model,@RequestParam(value="page",defaultValue = "1") int page) throws Exception{
		
		PageInfo<TbFans> result = FansService.GetFollow(UserNumber,page);
		List<TbFans> list = result.getList();
		model.put("UserNumber",UserNumber);
		model.put("BlogUserName",UserName);
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
		model.put("Sum",result.getTotal());
		return "User/UserFollow";
	}
}
