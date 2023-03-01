package com.xiwangly.test.work;

import java.util.Scanner;

public class Work7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入第一个数：");
        double num1 = input.nextDouble();

        System.out.print("请输入第二个数：");
        double num2 = input.nextDouble();

        System.out.print("请输入运算符（+、-、*、/）：");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("除数不能为0！");
                    return;
                }
                result = num1 / num2;
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, result);
                break;
            default:
                System.out.println("无效的运算符！");
                break;
        }

        input.close();
    }
}
