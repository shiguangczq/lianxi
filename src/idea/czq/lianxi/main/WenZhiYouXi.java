package idea.czq.lianxi.main;

import java.util.Random;
import java.util.Scanner;

public class WenZhiYouXi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = sc.next();
        int xuiLang = 400;
        int lanLiang = 200;
        String[] name1 = new String[3];
        name1[0] = "乔峰";
        name1[1] = "鸠摩智";
        name1[2] = "扫地僧";
        String jinengN0 = "【普通攻击】";
        String jinengN1 = "【掌心雷】";
        String jinengN2 = "【气体源流】";
        String jinengN3 = "【三昧真火】";
        String jinengN4 = "【降龙十八掌】";
        String jinengN5 = "【小无相功】";
        String jinengN6 = "【燃木刀法】";
        String jinengN7 = "【擒龙功】";
        String jinengN8 = "【易筋经】";
        String jinengN9 = "【金刚不坏神功】";
        String jinengN10 = "【九阳神功】";
        String jinengN11 = "【北冥神功】";
        String jinengN12 = "【六脉神剑】";
        String jinengN13 = "【葵花宝典】";
        String jinengN14 = "【九阴真经】";
        int jinengL0 = 0;
        int jinengL1 = -10;
        int jinengL2 = 50;
        int jinengL3 = -80;
        int jinengL4 = -100;
        int jinengL5 = 100;
        int jinengL6 = -80;
        int jinengL7 = -20;
        int jinengL8 = 100;
        int jinengL9 = -100;
        int jinengL10 = -50;
        int jinengL11 =  100;
        int jinengL12 =  -100;
        int jinengL13 =  -90;
        int jinengL14 =  80;
        int jinengS0 = -10;
        int jinengS1 = -20;
        int jinengS2 = 0;
        int jinengS3 = -80;
        int jinengS4 = -99;
        int jinengS5 = 0;
        int jinengS6 = -80;
        int jinengS7 = -20;
        int jinengS8 = 0;
        int jinengS9 = -80;
        int jinengS10 = 100;
        int jinengS11 = -50;
        int jinengS12 = -150;
        int jinengS13 = -120;
        int jinengS14 = -40;
        JiNeng jn0 = new JiNeng(jinengN0, jinengL0, jinengS0);
        JiNeng jn1 = new JiNeng(jinengN1, jinengL1, jinengS1);
        JiNeng jn2 = new JiNeng(jinengN2, jinengL2, jinengS2);
        JiNeng jn3 = new JiNeng(jinengN3, jinengL3, jinengS3);
        JiNeng jn4 = new JiNeng(jinengN4, jinengL4, jinengS4);
        JiNeng jn5 = new JiNeng(jinengN5, jinengL5, jinengS5);
        JiNeng jn6 = new JiNeng(jinengN6, jinengL6, jinengS6);
        JiNeng jn7 = new JiNeng(jinengN7, jinengL7, jinengS7);
        JiNeng jn8 = new JiNeng(jinengN8, jinengL8, jinengS8);
        JiNeng jn9 = new JiNeng(jinengN9, jinengL9, jinengS9);
        JiNeng jn10 = new JiNeng(jinengN10, jinengL10, jinengS10);
        JiNeng jn11 = new JiNeng(jinengN11, jinengL11, jinengS11);
        JiNeng jn12 = new JiNeng(jinengN12, jinengL12, jinengS12);
        JiNeng jn13 = new JiNeng(jinengN13, jinengL13, jinengS13);
        JiNeng jn14 = new JiNeng(jinengN14, jinengL14, jinengS14);
        Random r = new Random();
        for (int i=0; ; ) {
            int rr = r.nextInt(3);
            String name2 = name1[rr];
            RenWu rw = new RenWu(name, xuiLang, lanLiang);
            RenWu rw1 = new RenWu(name2, xuiLang, lanLiang);
            boolean jGG = JiNeng.jG(rw, rw1, jn0, jn1, jn2, jn3, jn4, jn5, jn6, jn7, jn8, jn9,jn10, jn11, jn12, jn13, jn14, rr);
            if (jGG) {
                System.out.println("恭喜你！挑战成功！");
                i++;
                System.out.println("这是你第"+i+"次挑战成功");
            } else {
                System.out.println("哦吼吼！挑战失败！你不行啊！");
                i++;
                System.out.println("这是你第"+i+"次挑战失败");
            }
            System.out.println("是否继续挑战:  继续(true)  退出(false)");
            boolean aa = sc.nextBoolean();
            if(!aa){
                break;
            }
        }
    }
    }
