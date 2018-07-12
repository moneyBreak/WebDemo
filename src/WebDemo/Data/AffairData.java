package WebDemo.Data;

public class AffairData {
    private String userid;
    private String AffairName;
    private int process;
    private int type;
    private String  date;
    private String content;
    private String enterprice;
    private int situ;

    public void setSitu(int situ) {
        this.situ = situ;
    }

    public int getSitu() {

        return situ;
    }

    public void setUserId(String userid) {
        this.userid = userid;
    }

    public void setAffairName(String affairName) {
        AffairName = affairName;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setEnterprice(String enterprice) {
        this.enterprice = enterprice;
    }

    public String getUserId() {

        return userid;
    }

    public String getAffairName() {
        return AffairName;
    }

    public int getProcess() {
        return process;
    }

    public int getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getEnterprice() {
        return enterprice;
    }
}
