package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Util.JsonUtils;
import mapper.TbFansMapper;
import pojo.TbFans;
import pojo.TbFansExample;
import redis.clients.jedis.JedisCluster;
import service.GetFollowNum;
@Service
public class GetFollowNumImpl implements GetFollowNum{
	@Autowired
	private TbFansMapper fansmapper;
	@Autowired
	private JedisCluster jediscluster;
	public Integer getfollow(String UserNumber) {
		TbFansExample example2 = new TbFansExample();
		pojo.TbFansExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andFrontUsernumberEqualTo(UserNumber);
		List<TbFans> list = fansmapper.selectByExample(example2);
		return list.size();
	}
	public boolean isfollow(String UserNumber, String BlogUserNumber) {
		if(UserNumber.equals(BlogUserNumber)) {
			return true;
		}
		TbFansExample example2 = new TbFansExample();
		pojo.TbFansExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andFrontUsernumberEqualTo(UserNumber);
		criteria2.andLastUsernumberEqualTo(BlogUserNumber);
		List<TbFans> list = fansmapper.selectByExample(example2);
		return list.size() > 0 ? true : false;
	}
	public List<TbFans> getfollowlist(String UserNumber) {
		
		try {
			String result = jediscluster.get(UserNumber+"/");
			if(result!=null&&result!="") {
				return JsonUtils.jsonToList(result, TbFans.class);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		TbFansExample example2 = new TbFansExample();
		pojo.TbFansExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andFrontUsernumberEqualTo(UserNumber);
		List<TbFans> list = fansmapper.selectByExample(example2);
		try {
			String result = JsonUtils.objectToJson(list);
			jediscluster.set(UserNumber+"/", result);
			jediscluster.expire(UserNumber+"/", 100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
