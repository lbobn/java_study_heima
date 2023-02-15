package com.map.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class A03_TreeMapDemo1 {
    public static void main(String[] args) {
        //不重复,无索引,可排序
        // 需求1:
        //键:整数表示id
        //值:字符串表示商品名称
        //要求:按照id的升序排列、按照id的降序排列

        //Integer,Double等默认按升序排序
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm.put(1034, "脉动");
        tm.put(1022, "康师傅");
        tm.put(1003, "雪碧");
        tm.put(1005, "可乐");

        System.out.println(tm);
    }
}
