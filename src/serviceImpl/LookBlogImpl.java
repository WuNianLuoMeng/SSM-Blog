package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import mapper.TbCommentMapper;
import pojo.TbBlogartical;
import pojo.TbComment;
import pojo.TbCommentExample;
import pojo.TbCommentExample.Criteria;
import service.LookBlog;

@Service
public class LookBlogImpl implements LookBlog {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Autowired
	private TbCommentMapper Mapper;

	@Override
	public TbBlogartical GetBlog(Integer id) throws Exception {

		TbBlogartical blog = mapper.selectByPrimaryKey(id);

		return blog;
	}
	/**
	 * 查询博客评论列表
	 */
	@Override
	public List<TbComment> GetBlogComment(Integer BlogId) throws Exception {

		TbCommentExample example = new TbCommentExample();
		Criteria criteria = example.createCriteria();
		/* 创建查询条件 */
		criteria.andBlogidEqualTo(BlogId);

		List<TbComment> list = Mapper.selectByExample(example);
		return list;
	}

}
