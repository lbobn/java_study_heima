package com.Innerclass.demo3;

public class Outer {

    //静态内部类
    static class Inner {
        public void show1() {
            System.out.println("非静态方法被调用");
        }

        public static void show2() {
            System.out.println("静态方法被调用");
        }
    }
}
