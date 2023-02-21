package com.a05waitandnotify1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
         *
         *    需求：完成生产者和消费者（等待唤醒机制）的代码
         *         实现线程轮流交替执行的效果
         *
         * */
        Cook c = new Cook();
        Foodie f = new Foodie();
        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
