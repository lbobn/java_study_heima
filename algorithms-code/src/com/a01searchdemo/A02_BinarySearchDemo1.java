package com.a01searchdemo;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        int[] arr = {12, 23, 25, 46, 59, 78, 112, 256, 450};
        System.out.println(binarySearch(arr, 256));


        //插值查找
        //mid=min + (key-arr[min]) / (arr[max]-arr[min]) * (max-min)
        //斐波那契查找
        //mid=min + 黄金分割点左半边长度-1


    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;

        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                //number在mid左边
                max = mid - 1;
            } else if (arr[mid] < number) {
                //number在mid右边
                min = mid + 1;
            } else {
                //找到返回索引
                return mid;
            }
        }
    }
}
