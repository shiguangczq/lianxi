package idea.czq.lianxi.main;

public class ShoJi {
    public String name;
    private int mm;
    private String ys;


    public ShoJi() {
    }

    public ShoJi(String name, int mm, String ys) {
        this.name = name;
        this.mm = mm;
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
     * @return mm
     */
    public int getMm() {
        return mm;
    }

    /**
     * 设置
     * @param mm
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

    /**
     * 获取
     * @return ys
     */
    public String getYs() {
        return ys;
    }

    /**
     * 设置
     * @param ys
     */
    public void setYs(String ys) {
        this.ys = ys;
    }

    public String toString() {
        return "ShoJi{name = " + name + ", mm = " + mm + ", ys = " + ys + "}";
    }
}
