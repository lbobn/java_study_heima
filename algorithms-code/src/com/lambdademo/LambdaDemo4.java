package com.lambdademo;

import java.util.Arrays;

public class LambdaDemo4 {
    public static void main(String[] args) {
        /*
         * 根据字符串长短对数组排序*/

        String[] arr = {"a", "aaaa", "aaa", "aa"};

        Arrays.sort(arr, ((o1, o2) -> o1.length() - o2.length()));

        System.out.println(Arrays.toString(arr));
    }
}
