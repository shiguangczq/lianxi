package idea.czq.lianxi.main;

public class XueShengGuanLiXiTonDuiXiang {
    private String id;
    private String name;
    private String age;
    private String home_address;


    public XueShengGuanLiXiTonDuiXiang() {
    }

    public XueShengGuanLiXiTonDuiXiang(String id, String name, String age, String home_address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.home_address = home_address;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取
     * @return home_address
     */
    public String getHome_address() {
        return home_address;
    }

    /**
     * 设置
     * @param home_address
     */
    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public String toString() {
        return "XueShengGuanLiXiTonDuiXiang{id = " + id + ", name = " + name + ", age = " + age + ", home_address = " + home_address + "}";
    }
}
