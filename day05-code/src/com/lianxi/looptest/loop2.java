package com.lianxi.looptest;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        //求一个大于等于2的整数的平方根，舍去小数部分。


/*
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x=sc.nextInt();
        int sqrt=0,sum=0;
        int i=1;
        if(x>=2){
            while(true){
                sum=i*i;
                if(sum<=x){
                    sqrt=i;
                    i++;
                }else{
                    break;
                }

            }
            System.out.println(sqrt);
        }else{
            System.out.println("数字不合法");
        }
*/
        System.out.println("请输入≥2的整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if ( i * i == number) {
                System.out.println(i + "是" + number + "的平方根");
                break;
            } else if (i * i > number) {
                System.out.println(i - 1 + "是" + number + "的平方根的整数部分");
                break;
            }

        }

    }
}
