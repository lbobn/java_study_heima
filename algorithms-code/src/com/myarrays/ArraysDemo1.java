package com.myarrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //Arrays类
        //操作数组的工具类

        //toString()
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr1));

        //binarySearch():二分查找法查找元素
        System.out.println(Arrays.binarySearch(arr1, 10));
        System.out.println(Arrays.binarySearch(arr1, 2));
        System.out.println(Arrays.binarySearch(arr1, 20));

        //copyOf()拷贝数组
        int[] newArr1 = Arrays.copyOf(arr1, 20);
        System.out.println(Arrays.toString(newArr1));

        //copyOfRange:拷贝数组（指定范围）
        //包头不包尾，包左不包右
        int[] newArr2 = Arrays.copyOfRange(arr1, 0, 9);
        System.out.println(Arrays.toString(newArr2));

        //fill()填充数组
        Arrays.fill(arr1, 100);
        System.out.println(Arrays.toString(arr1));

        //sort()排序。默认情况下，给基本数据类型升序排列，底层为快速排序
        int[] arr2 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }


}
