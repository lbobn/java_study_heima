package com.a02listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        //通用:
        //迭代器
        //增强for
        //Lambda (forEach()方法)

        // List独有的遍历方式
        //普通for循环
        //列表迭代器

        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //迭代器
        /*Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/

        //增强for
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //Lambda
        /* list.forEach(s -> System.out.println(s));*/

        //列表迭代器
        //比迭代器多了add()方法
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }

        //普通for(利用索引)
    }
}
