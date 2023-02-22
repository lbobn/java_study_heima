package com.test.test1;

public class ThreadTest {
    public static void main(String[] args) {
        /*一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒，
        要求:请用多线程模拟卖票过程并打印剩余电影票的数量
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}
