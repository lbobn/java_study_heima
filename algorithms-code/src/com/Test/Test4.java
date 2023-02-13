package com.Test;

public class Test4 {
    public static void main(String[] args) {
        //小明爬台阶
        //有时候一次跨两阶,有时候一次一阶
        //1层台阶:1种爬法
        //2层台阶:2种爬法
        //7层台阶:21种爬法
        //若有20阶,一共有几种爬法

        System.out.println(getCount(20));
    }

    private static int getCount(int n) {
        if (n == 1) {
            return 1;

        }
        if (n == 2) {
            return 2;
        }
        return getCount(n - 1) + getCount(n - 2);
    }
}
