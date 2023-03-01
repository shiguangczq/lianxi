package idea.czq.lianxi.main;

public class ShuZuCopy {
    public static void main(String[] args) {
        int[] arr = {12, 55, 66, 45, 888};
        int[] arrr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrr[i] = arr[i];
            System.out.println(arrr[i]);
        }
        arr[0] = 200;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

