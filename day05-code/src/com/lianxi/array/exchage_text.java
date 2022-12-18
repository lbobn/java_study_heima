package com.lianxi.array;

public class exchage_text {
    public static void main(String[] args) {
        /*定义数组存入1,2,3,4,5，交换元素使其逆序
         * 交换前1,2,3,4,5
         * 交换后5,4,3,2,1*/

        int[] arr = {1, 2, 3, 4, 5};
        int temp;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
