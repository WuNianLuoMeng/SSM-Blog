package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import mapper.TbFansMapper;

import pojo.TbFans;
import pojo.TbFansExample;
import pojo.TbFansExample.Criteria;

import service.FansFollow;

@Service
public class FansFollowImpl implements FansFollow{
	@Autowired
	private TbFansMapper mapper;

	@Override
	public PageInfo<TbFans> GetFans(String UserNumber,Integer page) throws Exception {
		
		
		// TODO Auto-generated method stub
		TbFansExample example = new TbFansExample();
		Criteria criteria =example.createCriteria();
		/*创建查询条件*/		
		criteria.andLastUsernumberEqualTo(UserNumber);
		//分页处理
		PageHelper.startPage(page, 10);
		List<TbFans> list = mapper.selectByExample(example);
		PageInfo<TbFans> pageinfo = new PageInfo<TbFans>(list);
		
		return pageinfo;
	}
	@Override
	public PageInfo<TbFans> GetFollow(String UserNumber, Integer page) throws Exception {		
		
		
		TbFansExample example = new TbFansExample();
		Criteria criteria =example.createCriteria();
		/*创建查询条件*/		
		criteria.andFrontUsernumberEqualTo(UserNumber);
		//分页处理
		PageHelper.startPage(page, 10);
		List<TbFans> list = mapper.selectByExample(example);
		PageInfo<TbFans> pageinfo = new PageInfo<TbFans>(list);
		
		return pageinfo;
	}
	
}
