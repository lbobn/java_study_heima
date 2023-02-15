package com.map.demo;

import java.util.TreeMap;

public class A03_TreeMapDemo2 {
    public static void main(String[] args) {
        //需求2:
        //键:学生对象
        //值:籍贯
        //要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。

        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("zhaoliu", 20);

        tm.put(s1, "广东");
        tm.put(s2, "湖北");
        tm.put(s3, "河南");
        tm.put(s4, "陕西");

        System.out.println(tm);
    }
}
