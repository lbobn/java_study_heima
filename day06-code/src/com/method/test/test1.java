package com.method.test;

import java.sql.SQLOutput;

public class test1 {
    public static void main(String[] args) {
        /*遍历数组，以[1,2,3,4]形式展示*/

        //定义数组,
        int[] arr1={11,22,33,44,55};
        int[] arr2={99,88,77,66,55};
        printArr(arr1);
        printArr(arr2);


        System.out.println();//只换行
        System.out.println("abc");//先打印abc，再换行
        System.out.print("abc");
        System.out.println("bcd");//只打印，不换行


    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1){
                System.out.print(arr[i]+", ");
            }else {
                System.out.print(arr[i]);
            }

        }
        System.out.println("]");
    }

}
