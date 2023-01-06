package com.mystatic.a01staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "老刘";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName="老王";

        s1.show();
        s1.study();

        Student s2 = new Student();

        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");

        s2.show();
        s2.study();
    }
}
