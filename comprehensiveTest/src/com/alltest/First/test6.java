package com.alltest.First;

public class test6 {
    public static void main(String[] args) {
        /*
         * 某系统的数字密码（大于0）。比如1983，采用加密方式传输，
         * 规则如下：
         *   每位数＋5
         *   再对10求余
         *   将所有数字反转
         * 即得到一串新数
         */

        //1.把整数中每一位放入数组
        int[] arr = {1, 9, 8, 3};
        //2.加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        //拼接为数字
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        //输出结果
        System.out.println("加密后为：" + number);


        /*解密*/
        //求出数字长度
        int temp = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //存入数组
        int[] arr2 = new int[count];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[i] = temp % 10;
            temp = temp / 10;
        }
        //解密
        for (int i = 0, j = arr2.length - 1; i < j; i++, j--) {
            int t = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = t;
        }
        //＋5后每个数范围[5,14],其中10,11,12,13,14取余后为0,1,2,3,4
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] <= 4) {
                arr2[i] = arr2[i] + 10;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] - 5;
        }
        //输出解密后结果
        int number2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            number2 = number2 * 10 + arr2[i];
        }
        System.out.println("解密后为：" + number2);
    }
}
