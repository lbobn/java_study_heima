package com.a04setdemo;

import java.util.LinkedHashSet;

public class A02_1_LinkedHashSetDemo1 {
    public static void main(String[] args) {
        //有序(多添加了双向链表来记录添加元素的顺序)

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 23);
        Student s4 = new Student("zhangsan", 23);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);//重复，添加失败，返回false


        System.out.println(lhs);
    }
}
