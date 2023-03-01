package idea.czq.lianxi.main;

public class DuiXiang {
    private String name;
    private int jg;
    private int ys;


    public DuiXiang() {
    }

    public DuiXiang(String name, int jg, int ys) {
        this.name = name;
        this.jg = jg;
        this.ys = ys;
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
     * @return jg
     */
    public int getJg() {
        return jg;
    }

    /**
     * 设置
     * @param jg
     */
    public void setJg(int jg) {
        this.jg = jg;
    }

    /**
     * 获取
     * @return ys
     */
    public int getYs() {
        return ys;
    }

    /**
     * 设置
     * @param ys
     */
    public void setYs(int ys) {
        this.ys = ys;
    }

    public String toString() {
        return "DuiXiang{name = " + name + ", jg = " + jg + ", ys = " + ys + "}";
    }
}