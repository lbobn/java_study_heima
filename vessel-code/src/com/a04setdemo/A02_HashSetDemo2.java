package com.a04setdemo;

import java.util.HashSet;
import java.util.List;

public class A02_HashSetDemo2 {
    public static void main(String[] args) {
        /*
        * 需求:创建一个存储学生对象的集合，存储多个学生对象。
                使用程序实现在控制台遍历该集合。
          要求:学生对象的成员变量值相同，我们就认为是同一个对象
        */
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 23);
        Student s4 = new Student("lisi", 23);

        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);//重复，添加失败，返回false

        System.out.println(hs);

    }
}
