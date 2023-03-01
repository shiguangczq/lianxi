package idea.czq.lianxi.main;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入范围");
        int arr = sc.nextInt();
        int arrr = sc.nextInt();
        for (int i = arr; i <=arrr ; i++) {
        boolean jg = pd(arr);
        if (jg) {
            System.out.println(arr + "是质数");
        }
        arr = arr+1;
        }
    }
    public static boolean pd(int arr) {

        for (int i = 2; i < arr; i++) {
            if (arr %i==0){
                return false;
            }
        }
        return true;


    }
}
