package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbFansMapper;
import pojo.TbFansExample;
import pojo.TbFansExample.Criteria;
import service.RemoveConcerns;
/**
 * 
* <p>Title: RemoveConcernsImpl.java<／p>
* <p>Description:删除关注 <／p>
* @author Ma
* @date 2019年5月26日
 */
@Service
public class RemoveConcernsImpl implements RemoveConcerns {
	@Autowired
	private TbFansMapper mapper;
	@Override
	public int Delete(Integer id) throws Exception {		
		int total = mapper.deleteByPrimaryKey(id);
		System.out.println(total);
		return total;
	}

}
