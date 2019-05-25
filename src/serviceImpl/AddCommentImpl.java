package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TbCommentMapper;
import pojo.TbComment;
import service.AddComment;
@Service
public class AddCommentImpl implements AddComment {
	@Autowired
	private TbCommentMapper mapper;
	@Override
	public int addcomment(TbComment comment) throws Exception {
		
		int total = mapper.insert(comment);
		
		
		return total;
	}

}
