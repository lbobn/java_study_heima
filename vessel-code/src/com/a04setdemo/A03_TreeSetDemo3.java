package com.a04setdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class A03_TreeSetDemo3 {
    public static void main(String[] args) {
        //排序方式二
        //比较器排序,使用含Comparator接口的构造创建对象

        /*TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //先根据长度，再按默认
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });*/
        TreeSet<String> ts = new TreeSet<>(
                (o1, o2) -> {
                    //先根据长度，再按默认
                    int i = o1.length() - o2.length();
                    i = i == 0 ? o1.compareTo(o2) : i;
                    return i;
                });

        ts.add("ba");
        ts.add("qwer");
        ts.add("cbc");
        ts.add("aa");

        System.out.println(ts);
    }
}
