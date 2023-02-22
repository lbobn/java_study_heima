package com.test.test6_2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        ArrayList<Integer> list0 = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {

                    System.out.print(getName() + ":" + list0);
                    System.out.print("最高奖项为" + Collections.max(list0));
                    int sum = getSum(list0);
                    System.out.println("总计额为" + sum);

                    break;
                } else {
                    Collections.shuffle(list);
                    int price = list.remove(0);
                    list0.add(price);
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
