package com.a01threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
         * 多线程的第一种启动方式：
         *   1. 自己定义一个类继承Thread
         *   2. 重写run方法
         *   3. 创建子类的对象，并启动线程
         * */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("线程1");
        mt2.setName("线程2");

        mt1.start();
        mt2.start();
    }
}
