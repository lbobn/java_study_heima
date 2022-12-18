package com.IT.demo1;

import java.util.Scanner;

public class QuGeWeiShu {
    public static void main(String[] args) {
        //键盘录入三位数，获取百位，十位，个位
        /*公式： 个位：数字%10
         *       十位：数字/10%10
         *       百位：数字/100%10......*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println("个位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);

    }
}








