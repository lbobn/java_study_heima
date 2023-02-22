package com.test.test2;

public class ThreadTest {
    public static void main(String[] args) {
        /*有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出。
        利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来.
         */

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "person1");
        Thread t2 = new Thread(mr, "person2");

        t1.start();
        t2.start();
    }
}
