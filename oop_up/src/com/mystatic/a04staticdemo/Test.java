package com.mystatic.a04staticdemo;

public class Test {
    public static void main(String[] args) {
        Student.teacherName = "老师";


        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.age = 18;
        System.out.println("s1:" + s1);
        s1.show1();


        System.out.println("--------------------");


        Student s2 = new Student();
        s2.name = "lisi";
        s2.age = 24;
        System.out.println("s2:" + s2);
        s2.show1();
    }
}
