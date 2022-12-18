package com.alltest.First;

public class test4 {
    public static void main(String[] args) {
        /*
        把一个数组复制到另一个新数组
         */

        int[] arr={2,1,3,6,5,8};
        //定义新数组
        int[] newArr =new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
