package idea.czq.lianxi.main;

public class XueSheng {
    public int numbre;
    public String name;
    private int age;

    public XueSheng() {
    }

    public XueSheng(int numbre, String name, int age) {
        this.numbre = numbre;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return numbre
     */
    public int getNumbre() {
        return numbre;
    }

    /**
     * 设置
     * @param numbre
     */
    public void setNumbre(int numbre) {
        this.numbre = numbre;
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

    public String toString() {
        return "XueSheng{numbre = " + numbre + ", name = " + name + ", age = " + age + "}";
    }
}