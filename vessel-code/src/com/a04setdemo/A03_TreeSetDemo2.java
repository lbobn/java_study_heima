package com.a04setdemo;

import java.util.TreeSet;

public class A03_TreeSetDemo2 {
    public static void main(String[] args) {
        /*
         * 排序方式
         * 方式一：
         *       默认的自然排序：Student实现Comparable,重写抽象方法
         *       默认使用方式一    */

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 25);
        Student s3 = new Student("wangwu", 24);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);
    }
}
