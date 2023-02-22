package com.test.test3;

public class ThreadTest {
    public static void main(String[] args) {
        /*同时开启两个线程，共同获取1-100之间的所有数字。
        要求:将输出所有的奇数。
         */
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "线程1");
        Thread t2 = new Thread(mr, "线程2");

        t1.start();
        t2.start();
    }


}
