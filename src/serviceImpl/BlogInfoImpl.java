package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import mapper.TbBlogarticalMapper;
import mapper.TbFansMapper;
import pojo.MyTbBlogartical;
import pojo.TbBlogartical;
import pojo.TbBlogarticalExample;

import pojo.TbBlogarticalExample.Criteria;
import pojo.TbFans;
import pojo.TbFansExample;

import service.BlogInfo;
import service.GetFansNum;
import service.GetFollowNum;
/**
 * 
* <p>Title: BlogInfoImpl.java<／p>
* <p>Description: 查询用户的博客内容<／p>
* @author Ma
* @date 2019年5月22日
 */
@Service
public class BlogInfoImpl implements BlogInfo {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Autowired
	private GetFansNum FanService;
	@Autowired
	private GetFollowNum FollowService;
	@Override
	public MyTbBlogartical GetBlogInfo(String UserNumber,int page) throws Exception {
		// TODO Auto-generated method stub
		MyTbBlogartical ans = new MyTbBlogartical();
		/*博客信息的查询*/
		TbBlogarticalExample example=new TbBlogarticalExample();
		Criteria criteria =example.createCriteria();
		/*创建查询条件*/		
		criteria.andBlogusernumberEqualTo(UserNumber);
		//分页处理
		PageHelper.startPage(page, 10);
		List<TbBlogartical> list = mapper.selectByExample(example);
		ans.setBloglist(new PageInfo<TbBlogartical>(list));
		
		/*粉丝和关注信息查询*/
		
		/*获取关注数*/
		ans.setFollownum(FanService.getfansnum(UserNumber));
		/*获取粉丝数*/			
		ans.setFansnum(FollowService.getfollow(UserNumber));
		return ans;
	}

}
