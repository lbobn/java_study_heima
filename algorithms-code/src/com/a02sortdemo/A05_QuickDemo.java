package com.a02sortdemo;

import java.util.Arrays;
import java.util.Random;

public class A05_QuickDemo {
    public static void main(String[] args) {
        /*快速排序
         * 以0索引数作为基准数，确定基准数在数组中的位置
         * 比基准数小的在左边，比基准数大的在右边*/

        //1.
        int[] arr1 = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        //2.
        int[] arr2 = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr2, 0, arr2.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找范围
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }
        //记录基准数
        int baseNumber = arr[i];

        while (start != end) {
            //利用end从后往前找比基准数小的
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start从前往后找比基准数大的
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //start和end指向的元素交换位置
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //start和end指向同一个元素时
        //表示基准数已经找到对应位置
        //基准数归位即可
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //基准数左边
        quickSort(arr, i, start - 1);
        //基准数右边
        quickSort(arr, start + 1, j);
    }
}
