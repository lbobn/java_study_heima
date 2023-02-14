package com.genericsdemo;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        //泛型方法
        //定义工具类，类中定义addAll()方法用来添加多个集合的元素、

        //
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list, "aaa", "bbb", "ccc", "ddd");

        System.out.println(list);


        //
        ArrayList<Integer> list1 = new ArrayList<>();

        ListUtil.addAll(list1, 1, 2, 3, 4);

        System.out.println(list1);
    }
}
