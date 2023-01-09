package com.extendcode.a06extendsdemo;

public class Student {
    String name;
    int age;
    String school;

    //需求：默认为传智大学

    public Student() {
        this(null, 0, "传智大学");
        //表示调用本类其他构造方法
        //并且构造方法只有一个有super()即可
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
