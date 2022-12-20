package com.oop.demo.test3;

public class Student {
    private String name;
    private int age;

    //空参的构造方法
    public Student() {
    }

    //带全部参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
