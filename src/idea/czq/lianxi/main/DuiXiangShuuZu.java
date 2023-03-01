package idea.czq.lianxi.main;

import java.util.Scanner;
public class DuiXiangShuuZu {
    public static void main(String[] args) {
        XueSheng [] xs = new XueSheng[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < xs.length; i++) {
            XueSheng x =new  XueSheng();
            System.out.println("请输入学生学号");
            int i1 = sc.nextInt();
            x.setNumbre(i1);
            System.out.println("请输入学生名字");
            String next = sc.next();
            x.setName(next);
            System.out.println("请输入学生年龄");
            int i2 = sc.nextInt();
            x.setAge(i2);
            xs[i]=x;
        }                       //第一次输入学生数据；
        int i2=0;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i]!=null) {
                i2++;
            }
        }                       //判断入取几个学生数据；
        XueSheng [] xss =TJXX(xs,i2);           //判断学号唯一性并且是否添加学生信息；
        XueSheng [] xsss =SCXX(xss);            //判断是否删除学生信息；
        for (int i = 0; i < xsss.length; i++) {
            XueSheng xxx = xsss[i];
            if (xsss[i]!=null) {            //判断是否为空；
                if (xxx.getNumbre() == 2) {         //判断是否学号为2 是则年龄+1；
                    xxx.setAge(xxx.getAge() + 1);
                }
                System.out.println("学号" + xxx.getNumbre() + "名字" + xxx.getName() + "年龄" + xxx.getAge());
            }
        }
    }

    public static XueSheng[] SCXX(XueSheng [] xss) {            //删除方法；
        System.out.println("请输入要删除的学生的学号");
        Scanner sc =new Scanner(System.in);
        int i1 = sc.nextInt();
        for (int i = 0; i < xss.length; i++) {
            XueSheng xxx = xss[i];
            if (xxx!=null) {            //判断不为空；
                if (i1 == xxx.getNumbre()) {
                    xss[i] = null;
                    System.out.println("成功删除！");
                    return xss;
                }
            }
        }
        System.out.println("抱歉！无当前学号！");
        return xss;
    }

    public static XueSheng[] TJXX(XueSheng [] xs,int i2) {              //判断学号唯一性；
        Scanner sc = new Scanner(System.in);
        System.out.println("当前学生个数："+i2);
        for (;;) {
            System.out.println("请输入学号");
            int i1 = sc.nextInt();
            int s1 = XSTJ(xs, i1);          //判断学号是否存在 不存在返回-1；
            if (s1 != -1) {
                System.out.println("抱歉当前学号不存在  可以继续输入");
                XueSheng [] xss =TJSJ(xs, i2, s1);
                return xss;
            }
            else {
                System.out.println("抱歉当前学号存在");
                break;
            }
        }
        return xs;
    }
    public static XueSheng [] TJSJ(XueSheng [] xs,int i2,int s1) {          //判断数组是否满了；
        XueSheng [] xss= new  XueSheng[xs.length+1];
        Scanner sc = new Scanner(System.in);
        if(i2==3){
            for (int i = 0; i < xs.length; i++) {           //新建一个数组存储信息；
                XueSheng xxxx = new XueSheng();
                xxxx.setNumbre(xs[i].getNumbre());
                xxxx.setName(xs[i].getName());
                xxxx.setAge(xs[i].getAge());
                xss[i]=xxxx;            //将旧数组信息添加回新数组内；
            }
            XueSheng xx = new XueSheng();
            xx.setNumbre(s1);
        System.out.println("请输入名字");            //添加新学生信息
            String next = sc.next();
            xx.setName(next);
            System.out.println("请输入年龄");
            int i = sc.nextInt();
            xx.setAge(i);
            xss[xs.length]=xx;
            for (int i1 = 0; i1 < xs.length+1; i1++) {          //打印新数组；
                XueSheng xxx =xss[i1];
                System.out.println("学号"+xxx.getNumbre()+"名字"+xxx.getName()+"年龄"+xxx.getAge());
            }
        }
        else {//旧数组空间未满则继续添加；
            for (int i1 = 0; i1 < i2; i1++) {//新建一个数组存储信息；
                XueSheng xxxx = new XueSheng();
                xxxx.setNumbre(xs[i1].getNumbre());
                xxxx.setName(xs[i1].getName());
                xxxx.setAge(xs[i1].getAge());
                xss[i1] = xxxx;            //将旧数组信息添加回新数组内；
            }
            XueSheng xx = new XueSheng();
                System.out.println("请输入名字");
                String next = sc.next();
                xx.setNumbre(s1);
                xx.setName(next);
                System.out.println("请输入年龄");
                int i = sc.nextInt();
                xx.setAge(i);
                xss[i2]=xx;
                for (int i3 = 0; i3 < xss.length; i3++) {
                    XueSheng xxx =xss[i3];
                    if(xxx!=null){
                    System.out.println("学号" + xxx.getNumbre() + "名字" + xxx.getName() + "年龄" + xxx.getAge());
                }
                }
        }
return xss;
    }

    public static int XSTJ(XueSheng [] xs,int i1) {         //判断学号是否存在；
            for (int i = 0; i < xs.length; i++) {
                XueSheng xx = xs[i];
                if (xx!=null) {
                    if (i1 == xx.getNumbre()) {
                        return -1;
                    }
                }
            }
return i1;
    }
    }