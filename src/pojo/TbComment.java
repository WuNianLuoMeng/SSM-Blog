package pojo;

public class TbComment {
    private Integer commentid;

    private String firstnumber;

    private String firstname;

    private String secondnumber;

    private String secondname;

    private Integer blogid;

    private String commentContent;

    private Integer flog;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(String firstnumber) {
        this.firstnumber = firstnumber == null ? null : firstnumber.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(String secondnumber) {
        this.secondnumber = secondnumber == null ? null : secondnumber.trim();
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname == null ? null : secondname.trim();
    }

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getFlog() {
        return flog;
    }

    public void setFlog(Integer flog) {
        this.flog = flog;
    }
}