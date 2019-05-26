package service;





import pojo.MyTbBlogartical;
public interface BlogInfo {
	MyTbBlogartical GetBlogInfo(String UserNumber,int page) throws Exception;
}
