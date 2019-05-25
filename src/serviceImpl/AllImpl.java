package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbBlogarticalMapper;
import pojo.TbBlogartical;
import pojo.TbBlogarticalExample;
import service.All;
@Service
public class AllImpl implements All {
	@Autowired
	private TbBlogarticalMapper mapper;
	@Override
	public List<TbBlogartical> qury() throws Exception {
		TbBlogarticalExample example = new TbBlogarticalExample();
		List<TbBlogartical> list = mapper.selectByExample(example);
		return list;
	}

}
