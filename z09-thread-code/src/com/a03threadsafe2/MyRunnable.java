package com.a03threadsafe2;

public class MyRunnable implements Runnable {
    static int ticket = 0;


    @Override
    public void run() {
        while (true) {
            if (method()) break;

        }
    }

    private synchronized boolean method() {

        if (ticket < 100) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");

        } else {
            return true;
        }

        return false;
    }
}
