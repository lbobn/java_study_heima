package com.test.test2;

public class MyRunnable implements Runnable {

    //第二种方式实现多线程，测试类中MyRunable只创建一次，所以不需要加static
    static int gift = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (gift < 10) {
                    break;
                } else {
                    gift--;
                    System.out.println(Thread.currentThread().getName() + "在送礼物,还剩" + gift + "个礼物");
                }
            }
        }
    }
}
