package idea.czq.lianxi.main;

public class DogAndCat {
    private int age;
    private String ys;

    public DogAndCat(int age, String ys) {
        this.age = age;
        this.ys = ys;
    }

    public DogAndCat() {
    }

    public void eat(String something){
        System.out.println("吃东西");
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
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
        return "DogAndCat{age = " + age + ", ys = " + ys + "}";
    }
}
