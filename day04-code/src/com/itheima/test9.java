package com.itheima;

public class test9 {
    public static void main(String[] args) {
        //判断回文数
        int x=12321;
        int sum=0;
        int temp=x;
        while (x!=0) {
            sum=sum*10+x%10;
            x/=10;
        }
        if(sum==temp){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
