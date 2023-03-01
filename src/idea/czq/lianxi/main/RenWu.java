package idea.czq.lianxi.main;

public class RenWu {
    private String name;
    private int xuiLiang;

    private int lanLiang;

    public RenWu(){};

    public RenWu(String name, int xuiLiang, int lanLiang){
        this.name = name;
        this.xuiLiang = xuiLiang;
        this.lanLiang =lanLiang;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setXuiLiang(int xuiLiang){
        this.xuiLiang = xuiLiang;
    }
    public int getXuiLiang(){
        return xuiLiang;
    }
    public void setLanLiang(int lanLiang){
        this.lanLiang = lanLiang;
    }
    public int getLanLiang (){
        return lanLiang;
    }

    public String toString() {
        return "RenWu{name = " + name + ", xuiLiang = " + xuiLiang + ", lanLiang = " + lanLiang + "}";
    }
}
