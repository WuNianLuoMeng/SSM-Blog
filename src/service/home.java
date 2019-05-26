package service;

import java.util.List;

import pojo.TbBlogartical;
import pojo.TbHome;

public interface home {
	List<TbHome> GetBlogList() throws Exception;
}
