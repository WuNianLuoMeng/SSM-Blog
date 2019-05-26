package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbFansMapper;
import pojo.TbFans;
import pojo.TbFansExample;
import service.GetFollowNum;
@Service
public class GetFollowNumImpl implements GetFollowNum{
	@Autowired
	private TbFansMapper fansmapper;
	public Integer getfollow(String UserNumber) {
		TbFansExample example2 = new TbFansExample();
		pojo.TbFansExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andLastUsernumberEqualTo(UserNumber);
		List<TbFans> list = fansmapper.selectByExample(example2);
		return list.size();
	}
}
