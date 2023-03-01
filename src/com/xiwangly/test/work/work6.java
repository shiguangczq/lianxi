package com.xiwangly.test.work;

public class Work6 {
    public static void main(String[] args) {
        int a = -10;
        int absValue = (a >> 31) == 0 ? a : (~a + 1);
        System.out.println(absValue);
    }
}
