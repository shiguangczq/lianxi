package idea.czq.lianxi.main;

import java.util.Scanner;

public class ShuZJM {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("请输入密码");
            int acc = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = acc % 10;
                acc = acc / 10;
            }
            int accc = abb(arr);
            String azz[] = new String[1];
            System.out.println("加密后：" + accc);
            System.out.println("是否解密");
            azz[0] = sc.next();
            switch (azz[0]) {
                case "yes":
                    System.out.println(abbb(arr, accc));
                    break;
                case "no":
                    break;
            }
        }
    }

    public static int abb(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
//        int lsbl=0;
//        for (int i = 0,j=arr.length-1; i <j; i++,j--) {
//            lsbl = arr[i];
//            arr[i] = arr[j];
//            arr[j] = lsbl;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            b=b*10+arr[i];
        }
        return  b;
    }

    public static int abbb(int arr[], int accc) {
        int lsbl,a=0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            lsbl = arr[i];
            arr[i] = arr[j];
            arr[j] = lsbl;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5 && arr[i] <= 9) {
                arr[i] = arr[i] - 5;
            } else {
                arr[i] = arr[i] + 5;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            a=a*10+arr[i];
        }
        return  a;
    }

}
