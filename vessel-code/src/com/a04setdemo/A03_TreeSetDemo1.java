package com.a04setdemo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class A03_TreeSetDemo1 {
    public static void main(String[] args) {
        /*用TreeSet添加整数并排序*/

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        System.out.println(ts);

        //遍历
        System.out.println("------------------------");
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
        }
        System.out.println("------------------------");
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("------------------------");
        /*ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/
        ts.forEach(integer -> System.out.println(integer));
    }
}
