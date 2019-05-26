package pojo;

public class TbFans {
    private Integer recordid;

    private String frontUsernumber;

    private String frontUsername;

    private String lastUsernumber;

    private String lastUsername;

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public String getFrontUsernumber() {
        return frontUsernumber;
    }

    public void setFrontUsernumber(String frontUsernumber) {
        this.frontUsernumber = frontUsernumber == null ? null : frontUsernumber.trim();
    }

    public String getFrontUsername() {
        return frontUsername;
    }

    public void setFrontUsername(String frontUsername) {
        this.frontUsername = frontUsername == null ? null : frontUsername.trim();
    }

    public String getLastUsernumber() {
        return lastUsernumber;
    }

    public void setLastUsernumber(String lastUsernumber) {
        this.lastUsernumber = lastUsernumber == null ? null : lastUsernumber.trim();
    }

    public String getLastUsername() {
        return lastUsername;
    }

    public void setLastUsername(String lastUsername) {
        this.lastUsername = lastUsername == null ? null : lastUsername.trim();
    }
}