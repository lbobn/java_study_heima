package com.test.test1;

public class MyThread extends Thread {
    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket == 1000) {
                    break;
                } else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "在卖票,剩" + (1000 - ticket) + "张票");
                }
            }
        }
    }
}
