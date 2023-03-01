package idea.czq.lianxi.main;

import java.util.Random;
import java.util.Scanner;

public class ShuangSQ {

    public static void main(String[] args) {
        Random r = new Random();
        int [] hss = new int[6];
        int [] lss = new int[1];
        int sjs,d;
        for (int i = 0; i < hss.length;) {
            sjs = r.nextInt(33) + 1;
            boolean oo=pd(hss,sjs);
            if(!oo){
                hss[i] = sjs;
                i++;
            }
        }
        for (int i = 0; i < lss.length; i++) {
            sjs = r.nextInt(16) + 1;
            lss[i] = sjs;
        }
        d=zff(hss,lss);
        zf(d);
    }

    public static boolean pd(int []hss,int sjs) {
        for (int j : hss) {
            if (j == sjs) {
                return true;
            }
        }
        return false;
    }


    public static boolean pdd(int []hs,int sjs) {
        for (int h : hs) {
            if (h == sjs) {
                return true;
            }
        }
            return false;
    }
    public static void zf(int d) {
        switch (d) {
            case 1 : System.out.println("恭喜你中了一等奖！");
            case 2 : System.out.println("恭喜你中了二等奖！");
            case 3 : System.out.println("恭喜你中了三等奖！");
            case 4 : System.out.println("恭喜你中了一四等奖！");
            case 5 : System.out.println("恭喜你中了五等奖！");
            case 6 : System.out.println("恭喜你中了六等奖！");
            case 0 : System.out.println("谢谢惠顾！");
        }
    }


    public static int zff(int [] hss,int [] lss) {
        int[] hs = new int[6];
        int[] ls = new int[1];
        int a,b,c,sjs;

        System.out.println("请输入红色号码");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < hs.length;) {
            sjs= sc.nextInt();
            boolean ooo=pdd(hs,sjs);
            if(!ooo){
                hs[i] = sjs;
            }
            else{
                System.out.println("抱歉！输入重复了，请重新输入！");
                continue;
            }
            if(hs[i]>=1 && hs[i]<=33){
                i++;
            }
            else {
                System.out.println("抱歉！输入错误，请重新输入!");
            }

        }
        System.out.println("请输入蓝色号码");
        for (int i = 0; i < ls.length;) {
            ls[i] = sc.nextInt();
            if(ls[i]>=1 && ls[i]<=16){
                i++;
            }
            else {
                System.out.println("抱歉！输入错误，请重新输入!");
            }

        }
        System.out.println("本期红色中奖号码分别是：");
        for (int j : hss) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("本期蓝色中奖号码分别是：");
        for (int j : lss) {
            System.out.print(j + " ");
        }
        a=zfff(hs,hss);
        b=zffff(ls,lss);
        c=z(a,b);
        return c;
    }

    public static int zfff(int[] hs, int[] hss) {
        int n = 0;
        for (int j : hss) {
            for (int h : hs) {
                if (h == j) {
                    n++;
                    break;
                }
            }
        }
        return n;
    }

    public static int zffff( int[] ls, int[] lss) {
        int m = 0;
        for (int j : lss) {
            for (int l : ls) {
                if (l == j) {
                    m++;
                    break;
                }
            }
        }
        return m;
    }

    public static int  z(int a,int b) {
        int c;
        if(a==1 && b==1 ||  a==2 && b==1 ||a==0 && b==1){
            c=6;
        } else if ( a==3 && b==1 || a==4 && b==0) {
            c=5;
        } else if (a == 4 && b==1 || a==5 && b==0) {
            c=4;
        } else if (a==5 && b==1) {
            c=3;
        } else if (a==6 && b==0) {
            c=2;
        } else if (a==6 && b==1) {
            c=1;
        }
        else{
            c=0;
        }
        return c;
    }
}
