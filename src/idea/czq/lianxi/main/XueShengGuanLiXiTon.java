package idea.czq.lianxi.main;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class XueShengGuanLiXiTon {

    private static final String LU_QUXUESHENGXINXI = "1";
    private static final String  SHAN_CHUXUESHENGXINXI= "2";
    private static final String  XOU_GAIXUESHENGXINXI= "3";
    private static final String  CHA_XOUXUESHENGXINXI= "4";

    public static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<XueShengGuanLiXiTonDuiXiang> list = new ArrayList<>();
        String i1;
        int i2 = 1;
        arr:do {
            caiDan();
            do {
                System.out.println("请输入你的选择");
                i1 = sc.next();
                if (string( i1)) {
                    break;
                }
                System.out.println("输入错误！请重新输入");
            }while (true);
            switch (i1) {
                case LU_QUXUESHENGXINXI: {
                    list = luQuXueShengXinXi(list, i2);
                    if (list.size() == i2) {
                        i2++;
                    }
                    break;
                }
                case SHAN_CHUXUESHENGXINXI: {
                    String id2;
                    int b = -1;
                    if (i2 == 1) {
                        System.out.println("抱歉！暂时没有学生信息，请先输入学生信息");
                        break;
                    }
                    System.out.println("请输入要删除学生的id");
                    id2 = sc.next();
                    for (int i = 0; i < list.size(); i++) {
                        if (Objects.equals(id2, list.get(i).getId())) {
                            list = shanChuXueShengXinXi(list, id2);
                            i2--;
                            b = 1;
                            break;
                        }
                    }
                    if (b == -1) {
                        System.out.println("抱歉！输入id有误。");
                    }
                    break;
                }
                case XOU_GAIXUESHENGXINXI: {
                    int b = -1;
                    if (i2 == 1) {
                        System.out.println("抱歉！暂时没有学生信息，请先输入学生信息");
                        break;
                    }
                    System.out.println("请输入学生id");
                    String i = sc.next();
                    for (int j1 = 0; j1 < list.size(); j1++) {
                        if (Objects.equals(i, list.get(j1).getId())) {
                            list = xouGaiXueShengXinXi(list, j1);
                            b = 1;
                            break;
                        }
                    }
                    if (b == -1) {
                        System.out.println("抱歉！没有找到相应的学生信息！请重新输入。");
                        break;
                    }
                }
                case CHA_XOUXUESHENGXINXI: {
                    if (i2 == 1) {
                        System.out.println("抱歉！暂时没有学生信息，请先输入学生信息");
                        break;
                    }
                    System.out.println("请输入查询学生的id");
                    String i = sc.next();
                    chaXouXueShengXinXi(list, i);
                    break;
                }
                case "5": {
                    System.out.println("谢谢使用，欢迎下次光临！");
                    break arr;
                }
                default:{
                    System.out.println("抱歉！选择超出服务范围了！");
                    break;
                }
            }
        } while (true);
    }

    public static void caiDan() {
        System.out.println("---------------欢迎来到学生管理系统---------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
        System.out.println("----------------------------------------------");
    }


    public static boolean string(String i1) {
            if (i1.equals("1")||i1.equals("2")||i1.equals("3")||i1.equals("4")||i1.equals("5")||i1.equals("6")||i1.equals("7")||i1.equals("8")||i1.equals("9")||i1.equals("0")) {
                return true;
            }if(i1.length()>=2) {
            System.out.println("你他妈的是不是找茬！！！");
        }
        return false;
    }

    public static boolean string1(String i1) {
        int n=-1;
        for (int i = 0; i <i1.length() ; i++) {
            if (i1.length() > 1) {
                if (i1.charAt(i) < '0' || i1.charAt(i) > '9') {
                    n = 1;
                }
            }
            if (i1.length() == 1) {
                return i1.charAt(i) > '0' && i1.charAt(i) <= '9';
            }
        }
        return n != 1;
    }


    public static void chaXouXueShengXinXi(ArrayList<XueShengGuanLiXiTonDuiXiang>list,String i) {
        System.out.println("id" + "\t\t名字" + "\t\t年龄" + "\t\t家庭住址");
        for (XueShengGuanLiXiTonDuiXiang xsglxtdx1 : list) {
            System.out.println(xsglxtdx1.getId() + "\t\t" + xsglxtdx1.getName() + "\t\t" + xsglxtdx1.getAge() + "\t\t" + xsglxtdx1.getHome_address());
        }
        int n = -1;
        System.out.println("查询的学生信息");
        for (XueShengGuanLiXiTonDuiXiang xueShengGuanLiXiTonDuiXiang : list) {
            if (Objects.equals(i, xueShengGuanLiXiTonDuiXiang.getId())) {
                System.out.println(xueShengGuanLiXiTonDuiXiang.getId() + "\t\t" + xueShengGuanLiXiTonDuiXiang.getName() + "\t\t" + xueShengGuanLiXiTonDuiXiang.getAge() + "\t\t" + xueShengGuanLiXiTonDuiXiang.getHome_address());
                n = 1;
            }
        }
        if (n == -1) {
            System.out.println("抱歉！无当前id学生");
        }
    }


    public static ArrayList<XueShengGuanLiXiTonDuiXiang> xouGaiXueShengXinXi(ArrayList<XueShengGuanLiXiTonDuiXiang> list,int j1) {
        Scanner sc = new Scanner(System.in);
        XueShengGuanLiXiTonDuiXiang xsglxtdx1 = list.get(j1);
        System.out.println("id" + "\t\t名字" + "\t\t年龄" + "\t\t家庭住址");
        System.out.println(xsglxtdx1.getId() + "\t\t" + xsglxtdx1.getName() + "\t\t" + xsglxtdx1.getAge() + "\t\t" + xsglxtdx1.getHome_address());
        System.out.println("请输入要修改的学生信息:1.id，2.姓名，3.年龄，4.家庭住址");
        String i1 = sc.next();
        int n;
        switch (i1){
            case "1":{
                String i2;
                do {
                    n = -1;
                    System.out.println("请输入修改后的id");
                    i2 = sc.next();
                    for (XueShengGuanLiXiTonDuiXiang xueShengGuanLiXiTonDuiXiang : list) {
                        if (i2.equals(xueShengGuanLiXiTonDuiXiang.getId())) {
                            System.out.println("抱歉！已经有了相同的id");
                            n = 1;
                            break;
                        }
                    }
                } while (n != -1);
                    list.get(j1).setId(i2);
                    break;
            }
            case "2":{
                System.out.println("请输入修改后的姓名");
                String next = sc.next();
                list.get(j1).setName(next);
                break;
            }
            case "3":{
                System.out.println("请输入修改后的年龄");
                String i2 = sc.next();
                list.get(j1).setAge(i2);
                break;
            }
            case "4":{
                System.out.println("请输入修改后的家庭住址");
                String next = sc.next();
                list.get(j1).setHome_address(next);
                break;
            }
            default:{
                System.out.println("抱歉！输入错误，请重新输入。");
                break;
            }

        }
        if (i1.equals("1")||i1.equals("2")||i1.equals("3")||i1.equals("4")) {
            System.out.println("修改后学生信息");
            System.out.println("id" + "\t\t名字" + "\t\t年龄" + "\t\t家庭住址");
            System.out.println(xsglxtdx1.getId() + "\t\t" + xsglxtdx1.getName() + "\t\t" + xsglxtdx1.getAge() + "\t\t" + xsglxtdx1.getHome_address());
        }
        return list;
    }



    public static ArrayList<XueShengGuanLiXiTonDuiXiang> luQuXueShengXinXi(ArrayList<XueShengGuanLiXiTonDuiXiang> list,int i2) {
        System.out.println(i2);
            XueShengGuanLiXiTonDuiXiang xsglxtdx = new XueShengGuanLiXiTonDuiXiang();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生id");
            String i = sc.next();
        for (int j1 = 0; j1 < list.size(); j1++) {
            if ( i.equals( list.get(j1).getId())) {
                System.out.println("抱歉！你输入了相同的id");
                return list;
            }
        }
                System.out.println("请输入学生名字");
                String next = sc.next();
                String i1;
                do {
                    System.out.println("请输入学生年龄");
                    i1 = sc.next();
                    if (string1(i1)) {
                        break;
                    }
                    System.out.println("输入的年龄不符合");
                }while (true);
                System.out.println("请输入学生家庭住址");
                String next1 = sc.next();
                xsglxtdx.setId(i);
                xsglxtdx.setName(next);
                xsglxtdx.setAge(i1);
                xsglxtdx.setHome_address(next1);
                list.add(xsglxtdx);
                System.out.println("id" + "\t\t名字" + "\t\t年龄" + "\t\t家庭住址");
                for (int j = 0; j < i2; j++) {
                    XueShengGuanLiXiTonDuiXiang xsglxtdx1 = list.get(j);
                    System.out.println(xsglxtdx1.getId() + "\t\t" + xsglxtdx1.getName() + "\t\t" + xsglxtdx1.getAge() + "\t\t" + xsglxtdx1.getHome_address());
                }
                return list;

    }

    public static ArrayList<XueShengGuanLiXiTonDuiXiang> shanChuXueShengXinXi(ArrayList<XueShengGuanLiXiTonDuiXiang>list,String id2) {
        for (int i1 = 0; i1 < list.size(); i1++) {
            XueShengGuanLiXiTonDuiXiang xsglxtdx2=list.get(i1);
            if(Objects.equals(xsglxtdx2.getId(), id2)){
                list.remove(i1);
                System.out.println("删除成功！");
            }
        }
        System.out.println("id" + "\t\t名字" + "\t\t年龄" + "\t\t家庭住址");
        for (XueShengGuanLiXiTonDuiXiang xsglxtdx1 : list) {
            System.out.println(xsglxtdx1.getId() + "\t\t" + xsglxtdx1.getName() + "\t\t" + xsglxtdx1.getAge() + "\t\t" + xsglxtdx1.getHome_address());
        }
        return list;
    }
}
