package textui;

import idea.ui.TanChuang;

import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;

public class JiSuanJi {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println("请输入数据");
        //提示语
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        //创建输入对象
        int s1length = s1.length();
        //获得数据长度
        char[] c = new char[s1.length()];
        //创建字符数组对象
        int [] i7=new int[s1length];
        //创建一个存储运算符下标的整形数组对象
        String s2 ="-?[1-9]\\d*([\\+\\-\\*/]\\d+)*([\\+\\-\\*/]\\d+)*";
        int i1 =0;
        //记录运算符下标
        int i2=0;
        //分别记录两个数据大小
        int i4=0;
        //记录运算符位置
        int i5=0;
        //判断第一位是否为负号
        int i6=0;
        //记录是否为负数的载体
        int i8=0;
        //记录多个运算符下标

        for (int i = 0; i < s1.length(); i++) {
            c[i]=s1.charAt(i);
        }
        for (int i = 0; i < s1length; i++) {
            if(c[i]<48 || c[i]>57 ){
                i7[i4]=i;
                i4++;
            }
        }
        for (int i = 0; i < i7.length; i++) {
            System.out.println(i7[i]);
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j)=='*' || s1.charAt(j)=='/') {
                    System.out.println(j);
                    if(i7[0]!=j){
                        for (int j1 = c[i7[0]]; j1 < c[i7[j+1]]; j1++) {

                        }
                    }
                }
            }
            i7[i]=0;
        }



        culi( s1,s2,c, i1, i2, i5,  i6,i7, i8 , s1length);
    }


    public static void culi(String s1,String s2,char[] c,int i1,int i2,int i5, int i6,int [] i7,int i8 ,int s1length) {
        if(s1.matches(s2)){
            for (int i = 0; i < s1.length(); i++) {
                c[i]=s1.charAt(i);
            }
            //将数据放置在字符数组中
            if(c[0]=='-'){
                i6=1;
                i1++;
            }
            //如果为负数则改变数值
            for (; i6 < c.length; i6++) {
                if (c[i6]>=48 && c[i6]<=57 ) {
                    i1++;
                } else {
                    if(i7[i8]>0){
                        i8++;
                        i1++;
                    }
                    //判断是否有多个运算符
                    i7[i8]=i1;
                    //记录运算符下标
                }
            }
            //获取运算符下标
            i7[i8+1]=s1length;
            //给最后添加原始数据长度用来方便计算
            if(c[0]=='-'){
                i5=1;
            }
            //判断第一位是否为负号
            for (int i = i5; i < i7[0]; i++) {
                i2=i2+c[i]-48;
                //获取键盘数字数据
                if(i<i7[0]-1){
                    i2=i2*10;
                    //整合数据
                }else if (i==i7[0]-1 && i5==1){
                    i2=-i2;
                }
                //判断是否为负数，是则添加负号
            }
            yunsuan(i8,i7,c, i2);
        }else {
            TanChuang.tanChuang("输入的数据不符合规定");
        }

    }

    public static void yunsuan(int i8 , int [] i7 , char [] c , int i2) {
        for (int i9 = 0; i9 < i8+1; i9++ ) {
            int i3=0;
            int i;
            for ( i = i7[i9] + 1; i < i7[i9 + 1] ; i++) {
                i3 = i3 + c[i] - 48;
                if (i < i7[i9+1]-1) {
                    i3 = i3 * 10;
                }
            }
            //分别获取两个数据的大小
            switch (c[i7[i9]]) {
                case '+':
                    int i4 = i2 + i3;
                    System.out.println(i2 + " + " + i3 + " = " + i4);
                    i2= i4;
                    break;
                case '-':
                    i4 = i2 - i3;
                    System.out.println(i2 + " - " + i3 + " = " + i4);
                    i2= i4;
                    break;
                case '*':
                    i4 = i2 * i3;
                    System.out.println(i2 + " * " + i3 + " = " + i4);
                    i2= i4;
                    break;
                case '/':
                    i4 = i2 / i3;
                    System.out.println(i2 + " / " + i3 + " = " + i4);
                    i2= i4;
                    break;
            }
        }
    }
}
