package com.a04setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        //set   无序，不能重复，无索引
        /*利用Set系列的集合，添加字符串，并使用多种方式遍历。
            迭代器
            增强for
            Lambda表达式
        */

        Set<String> s = new HashSet<>();

        //添加元素
        boolean r1 = s.add("zhangsan");
        boolean r2 = s.add("zhangsan");
        s.add("lisi");
        s.add("wangwu");
        System.out.println(r1);
        System.out.println(r2);//false(不能重复)

        //打印
        System.out.println(s);

        //迭代器遍历
        System.out.println("-------------迭代器遍历--------------");
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        //增强for遍历
        System.out.println("-------------增强for遍历--------------");
        for (String str : s) {
            System.out.println(str);
        }

        //Lambda表达式遍历
        System.out.println("-------------增强for遍历--------------");
/*        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });*/
        s.forEach(str -> System.out.println(str));
    }
}
