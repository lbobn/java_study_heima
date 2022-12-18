package com.lianxi.looptest;

import java.util.Scanner;



public class loop3 {
    public static void main(String[] args) {
        //键盘录入正整数，判断是否为质数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number=sc.nextInt();
        boolean flag=true;
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("是质数");
        }else{
            System.out.println("不是质数");
        }
    }
}
