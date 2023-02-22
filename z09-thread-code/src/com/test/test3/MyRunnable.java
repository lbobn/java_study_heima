package com.test.test3;

public class MyRunnable implements Runnable {
    //第二种方式实现多线程，测试类中MyRunable只创建一次，所以不需要加static
    int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (number > 100) {
                    break;
                } else {

                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + number);
                    }
                    number++;
                }
            }
        }
    }
}
