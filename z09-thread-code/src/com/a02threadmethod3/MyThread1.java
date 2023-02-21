package com.a02threadmethod3;

import com.a02threadmethod1.MyThread;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
