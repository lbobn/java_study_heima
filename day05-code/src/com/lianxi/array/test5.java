package com.lianxi.array;

import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        /*
        生成10个1~100的随机数存入数组
        1)求出所有数据和
        2)求出平均值
        3)统计比平均值小的个数
         */
        Random r=new Random();

        int[] a=new int[10];
        int sum=0;
        int count=0;
        for (int i = 0; i < 10; i++) {
            a[i]=r.nextInt(100)+1;
            sum+=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        double aver=sum/a.length;
        for (int i = 0; i < 10; i++) {
            if(a[i]<aver){
                count++;
            }
        }

        System.out.println('\n'+"和："+sum);
        System.out.println("平均值："+aver);
        System.out.println("小于平均值的个数："+count);
    }
}
