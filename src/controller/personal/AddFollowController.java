package controller.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.JedisCluster;
import service.AddFollow;
/**
 * 
* <p>Title: AddFollowController.java<／p>
* <p>Description: 添加关注controller<／p>
* @author Ma
* @date 2019年5月27日
 */
@Controller
public class AddFollowController {
	@Autowired
	private AddFollow service;
	@Autowired
	private JedisCluster jediscluster;
	@RequestMapping("/AddFollow")
	public String addfollow(ModelMap model,Integer BlogId,String first,String first_name,String second,String second_name) throws Exception{		
		Integer total = service.addfollow(first, first_name, second, second_name);				
		model.put("UserNumber",first);
		model.put("UserName",first_name);
		model.put("BlogUserNumber",second);
		model.put("BlogUserName",second_name);
		model.put("FollowNum",-1);
		model.put("FansNum",-1);
		model.put("BlogId",BlogId);
		if(total>0){
			model.put("flag",1);
			//当修改了用户所关注的博主之后要对redis中的缓存进行更新。
			//设置了生存的时间
			//清除redis缓存的信息，防止脏读
			if(jediscluster.get(first)!=""&&jediscluster.get(first)!=null){
				jediscluster.del(first);
			}
			return "redirect:/LookBlog";
		} else {
			model.put("flag",0);
			return "redirect:/LookBlog";
		}
	}
}
