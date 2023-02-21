package com.a02threadmethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
            public final void join()  插入线程/插队线程
       */
        MyThread t = new MyThread();
        t.setName("土豆");
        t.start();

        t.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main--" + i);
        }
    }
}
