package pojo;


import com.github.pagehelper.PageInfo;

public class MyTbBlogartical {
	private PageInfo<TbBlogartical> bloglist;
	private Integer fansnum;
    private Integer follownum;
	public PageInfo<TbBlogartical> getBloglist() {
		return bloglist;
	}
	public void setBloglist(PageInfo<TbBlogartical> bloglist) {
		this.bloglist = bloglist;
	}
	public Integer getFansnum() {
		return fansnum;
	}
	public void setFansnum(Integer fansnum) {
		this.fansnum = fansnum;
	}
	public Integer getFollownum() {
		return follownum;
	}
	public void setFollownum(Integer follownum) {
		this.follownum = follownum;
	}
}
