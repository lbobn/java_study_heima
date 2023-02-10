package com.a02sortdemo;

import java.util.Arrays;

public class A02_SelectionDemo {
    public static void main(String[] args) {
        //选择排序

        int[] arr = {2, 4, 5, 3, 1};

        //外循环，执行多少轮（n个数执行n-1轮）
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环，拿i索引与后面的比较，每轮结束索引i++
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
