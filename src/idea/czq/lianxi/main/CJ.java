package idea.czq.lianxi.main;

import java.util.Random;

public class CJ {
    public static void main(String[] args) {
    int arr[]={11,55,44,88};
    int att[]= new int[arr.length];
        Random r = new Random();
        for(int q=0;q<10;q++) {

            int j = r.nextInt(4);
            int aa = 0;
            for (int i = 0; i < j; i++) {
                aa = arr[i];
                arr[i] = arr[j];
                arr[j] = aa;
                j = r.nextInt(4);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("-----------------------------------------");
        }
    }
}
