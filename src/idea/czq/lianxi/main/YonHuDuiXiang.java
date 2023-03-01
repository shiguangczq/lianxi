package idea.czq.lianxi.main;

public class YonHuDuiXiang {
    private String name;        //用户名
    private String mm;        //密码
    private String sfzhm;        //身份证号码
    private String sjhm;        //手机号码


    public YonHuDuiXiang() {
    }

    public YonHuDuiXiang(String name, String mm, String sfzhm, String sjhm) {
        this.name = name;
        this.mm = mm;
        this.sfzhm = sfzhm;
        this.sjhm = sjhm;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return mm
     */
    public String getMm() {
        return mm;
    }

    /**
     * 设置
     * @param mm
     */
    public void setMm(String mm) {
        this.mm = mm;
    }

    /**
     * 获取
     * @return sfzhm
     */
    public String getSfzhm() {
        return sfzhm;
    }

    /**
     * 设置
     * @param sfzhm
     */
    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    /**
     * 获取
     * @return sjhm
     */
    public String getSjhm() {
        return sjhm;
    }

    /**
     * 设置
     * @param sjhm
     */
    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String toString() {
        return "YonHuDuiXiang{name = " + name + ", mm = " + mm + ", sfzhm = " + sfzhm + ", sjhm = " + sjhm + "}";
    }
}
