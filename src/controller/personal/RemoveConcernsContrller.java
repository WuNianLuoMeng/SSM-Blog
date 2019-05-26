package controller.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.JedisCluster;
import service.RemoveConcerns;
/**
 * 
* <p>Title: RemoveConcernsContrller.java<／p>
* <p>Description:取消关注controller <／p>
* @author Ma
* @date 2019年5月26日
 */
@Controller
public class RemoveConcernsContrller {
	@Autowired
	private RemoveConcerns service;
	@Autowired
	private JedisCluster jediscluster;

	@RequestMapping("/RemoveConcerns")
	public String RemoveConcerns(Integer id,String UserName, ModelMap model, String first) throws Exception {

		int total = service.Delete(id);
		if (total > 0) {
			//清除redis缓存的信息，防止脏读
			if(jediscluster.get(first)!=""&&jediscluster.get(first)!=null){
				jediscluster.del(first);
			}
		}
		model.put("UserName", UserName);
		model.put("page", 1);		
		return "redirect:/follow/" + first;
	}
}
