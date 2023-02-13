package com.Test;

public class Test5 {
    public static void main(String[] args) {
        //小明爬台阶
        //有时候一次三阶,有时候一次跨两阶,有时候一次一阶,
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
        if (n == 3) {
            return 4;
        }
        return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
    }
}
