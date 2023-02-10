package com.a02sortdemo;

public class A04_RecursionDemo {
    public static void main(String[] args) {
        //递归
        //求1~100和
        System.out.println(getSum(100));
        //求5！
        System.out.println(getFactorialRecursion(5));
    }

    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        }

        return number + getSum(number - 1);
    }

    public static int getFactorialRecursion(int number) {
        if (number == 1) {
            return 1;
        }

        return number * getFactorialRecursion(number - 1);
    }
}
