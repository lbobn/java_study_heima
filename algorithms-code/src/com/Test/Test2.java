package com.Test;

public class Test2 {
    public static void main(String[] args) {
        //斐波那契数列
        //不死神兔
        //1:1   2:1     3:2     4:3     5:5     5:8
        //从第三个数开始,是前两个数的和

        //一.
        int[] arr = new int[12];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);
        //二.递归
        System.out.println(getSum(12));

    }

    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}
