package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbFansMapper;
import pojo.TbFans;
import pojo.TbFansExample;
import service.GetFansNum;
@Service
public class GetFansNumImpl implements GetFansNum{
	@Autowired
	private TbFansMapper fansmapper;
	public Integer getfansnum(String UserNumber) {
		TbFansExample example1 = new TbFansExample();
		pojo.TbFansExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andFrontUsernumberEqualTo(UserNumber);
		List<TbFans> list = fansmapper.selectByExample(example1);
		return list.size(); 
	}
}
