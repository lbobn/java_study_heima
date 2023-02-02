package com.oop_codeblock.demo2;

public class Student {
    private String name;
    private int age;

    //静态代码块:只执行一次

    static {
        System.out.println("开始创建对象了");
    }

    public Student() {
    }

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
