package com.lianxi.array;

import java.util.Random;

public class disturb_array {
    public static void main(String[] args) {
        //定义一数组存入1~5，
        //随机打乱数据

        int[] arr={1,2,3,4,5};
        Random r=new Random();
        //数组的随机索引   r.nextInt(arr.length)
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
