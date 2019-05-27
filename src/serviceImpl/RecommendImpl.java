package serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Util.JsonUtils;
import pojo.MyFansPOJO;
import pojo.TbFans;
import redis.clients.jedis.JedisCluster;
import service.GetFollowNum;
import service.Recommend;
/**
 * 
* <p>Title: RecommendImpl.java<／p>
* <p>Description: 实现推荐用户功能<／p>
* @author Ma
* @date 2019年5月27日
 */
@Service
public class RecommendImpl implements Recommend {
	@Autowired
	private GetFollowNum FollowService;
	@Autowired
	private JedisCluster jediscluster;
	@Override
	public List<MyFansPOJO> GetRecommend(String UserNumber) throws Exception {
		/*检查redis中是否已经缓存该用户的关注用户信息*/
		
		List<MyFansPOJO> ans = new ArrayList<MyFansPOJO>();
		List<TbFans> list = FollowService.getfollowlist(UserNumber);
		
		int length = list.size();
		
		Random rand = new Random();
		
		List<TbFans> list0 = FollowService.getfollowlist(UserNumber);
		

		if(list.size()>=2) {
			int x1 = rand.nextInt(length);
			int x2 = rand.nextInt(length);
			
			List<TbFans> list1 = FollowService.getfollowlist(list.get(x1).getLastUsernumber());
			List<TbFans> list2 = FollowService.getfollowlist(list.get(x2).getLastUsernumber());
			System.out.println(x1+"/"+x2);
			/*当前用户所关注的用户*/
			for(TbFans x : list0) {
				
				MyFansPOJO item = new MyFansPOJO();
				item.setUsername(x.getLastUsername());
				item.setUsernumber(x.getLastUsernumber());				
				jediscluster.sadd("{usernumber}:"+UserNumber,JsonUtils.objectToJson(item));
			}
			
			/*第一个人的关注*/
			for(TbFans x : list1) {
				
				MyFansPOJO item = new MyFansPOJO();
				item.setUsername(x.getLastUsername());
				item.setUsernumber(x.getLastUsernumber());				
				jediscluster.sadd("{usernumber}:"+list.get(x1).getLastUsernumber(),JsonUtils.objectToJson(item));
			}
			/*第二个人的关注*/
			for(TbFans x : list2) {
				MyFansPOJO item = new MyFansPOJO();
				item.setUsername(x.getLastUsername());
				item.setUsernumber(x.getLastUsernumber());	
				jediscluster.sadd("{usernumber}:"+list.get(x2).getLastUsernumber(),JsonUtils.objectToJson(item));
			}			
			Set<String> set1 = jediscluster.sunion("{usernumber}:"+list.get(x1).getLastUsernumber(),"{usernumber}:"+list.get(x2).getLastUsernumber());			
			for(String x:set1) {
				//一个中间过渡,选中两个集合的并集
				jediscluster.sadd("{usernumber}:-1",x);
			}					
			Set<String> set = jediscluster.sdiff("{usernumber}:-1","{usernumber}:"+UserNumber);
			for(String x : set) {
				//System.out.println(JsonUtils.jsonToPojo(x, MyFansPOJO.class).getUserName());
				ans.add(JsonUtils.jsonToPojo(x, MyFansPOJO.class));
			}
		}
		jediscluster.del("{usernumber}:-1");
		return ans;
	}

}
