package apiDemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int num1 = sc.nextInt();
        System.out.println("请输入小数");
        double num2 = sc.nextDouble();
        System.out.println("请输入字符串");
        String s1 = sc.next();
        System.out.println("请输入字符串");
        String s2 = sc.nextLine();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(s1);
        System.out.println(s2);
        /*请输入整数
        123
        请输入小数
        123.6
        请输入字符串
        abc abc
        请输入字符串
        123
        123.6
        abc
         abc*/
    }

}
