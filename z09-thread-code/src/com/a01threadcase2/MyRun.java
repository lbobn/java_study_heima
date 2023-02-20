package com.a01threadcase2;

public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取到当前线程的对象
            /*Thread t = Thread.currentThread();
            System.out.println(t.getName() + "HelloWorld!");*/
            System.out.println(Thread.currentThread().getName() + "HelloWorld");
        }
    }
}
