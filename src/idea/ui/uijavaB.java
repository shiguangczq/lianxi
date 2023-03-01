package idea.ui;

public class uijavaB {
    private String yonHuMing;
    private String miMa;

    public uijavaB() {
    }

    public uijavaB(String yonHuMing, String miMa) {
        this.yonHuMing = yonHuMing;
        this.miMa = miMa;
    }

    /**
     * 获取
     * @return yonHuMing
     */
    public String getYonHuMing() {
        return yonHuMing;
    }

    /**
     * 设置
     * @param yonHuMing
     */
    public void setYonHuMing(String yonHuMing) {
        this.yonHuMing = yonHuMing;
    }

    /**
     * 获取
     * @return miMa
     */
    public String getMiMa() {
        return miMa;
    }

    /**
     * 设置
     * @param miMa
     */
    public void setMiMa(String miMa) {
        this.miMa = miMa;
    }

    public String toString() {
        return "uijavaB{yonHuMing = " + yonHuMing + ", miMa = " + miMa + "}";
    }
}