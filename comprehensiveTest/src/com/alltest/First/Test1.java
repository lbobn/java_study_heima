package com.alltest.First;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*买机票
         * 按如下规则计算机票价格：
         * 旺季（5-10月）头等舱9折，经济舱8.5折
         * 淡季（11-来年4月）：头等舱7折，经济舱6.5折。*/

        /*键盘录入机票原价、月份、和坐席类别*/


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price_old = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入坐席类别（1.头等舱 2.经济舱）");
        int seat_kind = sc.nextInt();

        double price_new=getPrice(price_old,month,seat_kind);
        if(price_new!=-1){
            System.out.println("最终价格为："+price_new);
        }


    }



    //ctrl+alt+M抽取方法
    //需要原价，月份，舱别，折扣
    public static double getPrice(double original_cost,int month,int seat){
        switch (month) {
            case 5, 6, 7, 8, 9, 10: {
                if (seat == 1) {
                    return original_cost * 0.9;
                } else if (seat == 2) {
                    return original_cost * 0.85;
                } else {
                    System.out.println("坐席种类不合法！");
                    return -1;
                }
            }
            case 1, 2, 3, 4, 11, 12: {
                if (seat == 1) {
                    return original_cost * 0.7;
                } else if (seat == 2) {
                    return original_cost * 0.65;
                } else {
                    System.out.println("坐席种类不合法！");
                    return -1;
                }
            }
            default:{
                System.out.println("月份不合法！");
                return -1;
            }
        }
    }
}
