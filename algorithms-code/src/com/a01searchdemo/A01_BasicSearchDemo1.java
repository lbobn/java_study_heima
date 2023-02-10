package com.a01searchdemo;

import java.util.Arrays;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找/顺序查找

        int[] arr = {133, 254, 12, 25, 67, 89, 19, 156, 67};
        int number = 67;
        System.out.println(basicSearch1(arr, number));
        //不考虑数组内容重复
        System.out.println("不考虑数组内容重复");
        System.out.println(basicSearch2(arr, number));
        //考虑数组内容重复
        System.out.println("考虑数组内容重复");
        int[] result = basicSearch3(arr, number);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(result[i]);
            }
        }

    }

    public static boolean basicSearch1(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    //不考虑数组内容重复
    public static int basicSearch2(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //考虑数组内容重复
    public static int[] basicSearch3(int[] arr, int number) {
        int flag = 0;
        int[] index = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                flag = 1;
                index[j] = i;
                j++;
            }
        }
        return index;

    }
}
