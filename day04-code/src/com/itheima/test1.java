package com.itheima;


import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入钱数：");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("去网红餐厅吃");
        } else {
            System.out.println("去吃沙县小吃");
        }
    }

}
