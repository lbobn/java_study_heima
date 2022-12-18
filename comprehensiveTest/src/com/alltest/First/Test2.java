package com.alltest.First;

public class Test2 {
    public static void main(String[] args) {
        //判断101-200之间有多少素数，并输出

        int count=0;
        for (int i = 101; i <= 200; i++) {
            int flag=1;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag!=0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("共有"+count+"个质数");
    }
}
