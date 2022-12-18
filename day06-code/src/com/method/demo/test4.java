package com.method.demo;

public class test4 {
    public static void main(String[] args) {
        //方法的重载
        //用重载思想设计两个整数是否相等，要求兼容：（byte，short，int，long）
        compare(1, 2);

        //需在同一class类，并且形参不同则构成重载
        //相同功能写同个方法名
    }

    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }

    public static void compare(short s1, short s2) {
        System.out.println(s1 == s2);
    }

    public static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
    }

    public static void compare(long n1, long n2) {
        System.out.println(n1 = n2);
    }

}
