package pojo;

public class TbBloguser {
    private String blogusernumber;

    private String blogusername;

    private String bloguserpassword;

    public String getBlogusernumber() {
        return blogusernumber;
    }

    public void setBlogusernumber(String blogusernumber) {
        this.blogusernumber = blogusernumber == null ? null : blogusernumber.trim();
    }

    public String getBlogusername() {
        return blogusername;
    }

    public void setBlogusername(String blogusername) {
        this.blogusername = blogusername == null ? null : blogusername.trim();
    }

    public String getBloguserpassword() {
        return bloguserpassword;
    }

    public void setBloguserpassword(String bloguserpassword) {
        this.bloguserpassword = bloguserpassword == null ? null : bloguserpassword.trim();
    }
}