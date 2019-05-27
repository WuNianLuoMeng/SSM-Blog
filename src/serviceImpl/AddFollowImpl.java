package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbFansMapper;
import pojo.TbFans;
import service.AddFollow;
/**
 * 
* <p>Title: AddFollowImpl.java<／p>
* <p>Description: 添加关注<／p>
* @author Ma
* @date 2019年5月27日
 */
@Service
public class AddFollowImpl implements AddFollow {
	@Autowired
	private TbFansMapper mapper;
	@Override
	public Integer addfollow(String first, String first_name, String second, String second_name) throws Exception {
		
		TbFans x = new TbFans();
		x.setFrontUsername(first_name);
		x.setFrontUsernumber(first);
		x.setLastUsername(second_name);
		x.setLastUsernumber(second);
		
//		mapper.insertSelective(record)
		
		int total = mapper.insert(x);
		return total;
	}

}
