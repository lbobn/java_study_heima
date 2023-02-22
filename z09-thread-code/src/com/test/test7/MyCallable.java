package com.test.test7;

import com.test.test6_2.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> list0 = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {

                    System.out.print(Thread.currentThread().getName() + ":" + list0);
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
        if (list0.size() == 0) {
            return null;
        } else {
            return Collections.max(list0);
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
