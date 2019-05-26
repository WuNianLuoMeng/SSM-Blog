package pojo;

import java.util.Date;

public class TbHome {
    private Integer blogid;

    private String blogusernumber;

    private String blogtitle;

    private Date blogdata;

    private Integer blogtraffic;

    private String blogcontent;

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBlogusernumber() {
        return blogusernumber;
    }

    public void setBlogusernumber(String blogusernumber) {
        this.blogusernumber = blogusernumber == null ? null : blogusernumber.trim();
    }

    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle == null ? null : blogtitle.trim();
    }

    public Date getBlogdata() {
        return blogdata;
    }

    public void setBlogdata(Date blogdata) {
        this.blogdata = blogdata;
    }

    public Integer getBlogtraffic() {
        return blogtraffic;
    }

    public void setBlogtraffic(Integer blogtraffic) {
        this.blogtraffic = blogtraffic;
    }

    public String getBlogcontent() {
        return blogcontent;
    }

    public void setBlogcontent(String blogcontent) {
        this.blogcontent = blogcontent == null ? null : blogcontent.trim();
    }
}