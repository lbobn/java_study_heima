package com.itheima;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        //商品总价1000
        /*
         * 根据会员等级打折
         * 1级：打九折
         * 2级：打八折
         * 3级：打七折
         * 非会员：不打折*/

        //录入会员等级
        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级");
        int VIP = sc.nextInt();
        //判断合法性及结果
        if (VIP >= 0 && VIP <= 3) {
            if (VIP == 1) {
                System.out.println("打九折" + price * 0.9);
            } else if (VIP == 2) {
                System.out.println("打八折" + price * 0.8);
            } else if (VIP == 3) {
                System.out.println("打七折" + price * 0.7);
            } else {
                System.out.println("不打折" + price);
            }

        } else {
            System.out.println("数值不合法");
        }
    }
}
