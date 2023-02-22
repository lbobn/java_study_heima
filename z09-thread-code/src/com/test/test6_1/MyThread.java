package com.test.test6_1;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程1
    ArrayList<Integer> list1 = new ArrayList<>();
    //线程2
    ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    if ("抽奖箱1".equals(getName())) {
                        System.out.print("抽奖箱1:" + list1);
                        System.out.print("最高奖项为" + Collections.max(list1));
                        int sum = getSum(list1);
                        System.out.println("总计额为" + sum);

                    } else {
                        System.out.print("抽奖箱2:" + list2);
                        System.out.print("最高奖项为" + Collections.max(list2));
                        int sum = getSum(list2);
                        System.out.println("总计额为" + sum);
                    }
                    break;
                } else {
                    Collections.shuffle(list);
                    int price = list.remove(0);
                    if ("抽奖箱1".equals(getName())) {
                        list1.add(price);
                    } else {
                        list2.add(price);
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
