package com.a02system.demo;

public class SystemDemo2 {
    public static void main(String[] args) {
//        currentTimeMillis() 可用来计算程序运行时间
        //平方算法
        int count1 = 0;
        long start1 = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            if (isPrime1(i)) {
                count1++;
            }
        }

        long end1 = System.currentTimeMillis();
        System.out.println("平方算法");
        System.out.println(count1);
        System.out.println(end1 - start1);

        //普通算法
        int count2 = 0;
        long start2 = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            if (isPrime2(i)) {
                count2++;
            }
        }

        long end2 = System.currentTimeMillis();
        System.out.println("普通算法");
        System.out.println(count2);
        System.out.println(end2 - start2);
    }

    public static boolean isPrime1(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime2(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
