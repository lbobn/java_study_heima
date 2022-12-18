package com.itheima;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //if嵌套
        /*
         * 根据不同分数送不同礼物
         * 95~100
         * 90~94
         * 80~89
         * 80以下*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = sc.nextInt();
        //判断并验证数值合法性
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车一两");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        } else {
            System.out.println("录入成绩不合法");
        }
    }
}
