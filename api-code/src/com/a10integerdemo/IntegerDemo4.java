package com.a10integerdemo;

import java.util.Scanner;

public class IntegerDemo4 {
    public static void main(String[] args) {
        //整数转为二进制
        String str1 = Integer.toBinaryString(16);
        System.out.println(str1);

        //整数转为八进制
        String str2 = Integer.toOctalString(16);
        System.out.println(str2);

        //整数转为十六进制
        String str3 = Integer.toHexString(16);
        System.out.println(str3);

        //将字符串转为int整数
        //八种包装类中，只有Character没有parseXxx方法
        int i = Integer.parseInt("123");
        System.out.println(i);

        //键盘录入改写
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int a = Integer.parseInt(s);
        System.out.println(a);
    }
}
