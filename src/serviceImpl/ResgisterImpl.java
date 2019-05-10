package serviceImpl;

import mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.*;
import service.Resgister;
@Service
public class ResgisterImpl implements Resgister {
	@Autowired
	private TbBloguserMapper bloguserMapper;

	@Override
	public boolean insert(TbBloguser user) throws Exception {
		// TODO Auto-generated method stub
		int row = bloguserMapper.insert(user);

		return row > 0 ? true : false;
	}



	
}
