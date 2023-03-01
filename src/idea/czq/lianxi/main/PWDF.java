package idea.czq.lianxi.main;

import java.util.Scanner;

public class PWDF {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请评委打分");
        for (int i = 0; i < arr.length; ) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0 && arr[i] <= 100) {
                i++;
            } else {
                System.out.println("抱歉请重新输入");
            }
        }
        System.out.println("去掉一个最高分：" + abb(arr));
        System.out.println("去掉一个最低分：" + abbb(arr));
        System.out.println("结果为：" + abbbb(arr,abb(arr),abbb(arr)));
    }

    public static int abb(int arr[]) {
        int acc = arr[0];
        int accc = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > acc) {
                acc = arr[i];
            }
        }
        return acc;
    }

    public static int abbb(int arr[]) {
        int accc = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < accc) {
                accc = arr[i];
            }
        }
        return accc;
    }

    public static int abbbb(int arr[],int acc,int accc) {
        int acccc=arr[0];
        for (int i = 1; i < arr.length; i++) {
            acccc += arr[i];
        }
        acccc=(acccc-(accc+acc))/4;
        return acccc;
    }
}