package com.map.test;

import java.util.HashMap;

public class A01_HashMapTest1 {
    public static void main(String[] args) {
        // 需求:创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        //      存储三个键值对元素，并遍历
        //      要求:同姓名，同年龄认为是同一个学生
        //核心点:
        //      HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");

        hm.forEach((Student, address) -> System.out.println(Student + "=" + address));
    }
}
