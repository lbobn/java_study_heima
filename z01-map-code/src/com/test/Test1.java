package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //随机点名
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张三", "李四", "王五", "赵六", "李奇", "刘洋");

        /*Random r=new Random();
        String s = list.get(r.nextInt(list.size()));
        System.out.println(s);*/

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
