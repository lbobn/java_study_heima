package com.a02sortdemo;

import java.util.Arrays;

public class A01_BubbleDemo1 {
    public static void main(String[] args) {
        //冒泡排序

        int[] arr = {2, 4, 5, 3, 1};

        //外循环，执行多少轮（n个数执行n-1轮）
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环，每轮执行多少次比较，每轮结束下次次数比上轮减1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
