package com.a02threadmethod2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            setPriority(int newPriority)        设置线程的优先级
            final int getPriority()             获取线程的优先级
       */

        //创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "坦克");


        t1.setPriority(1);//默认优先级5
        t2.setPriority(10);//优先级越高，先执行完的概率越高


        t1.start();
        t2.start();
        //main()线程
        int priority = Thread.currentThread().getPriority();
        System.out.println(priority);
    }
}
