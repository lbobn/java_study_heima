package com.mystatic.a04staticdemo;

/*
    总结:
        静态方法中无this关键字
        静态方法只能访问静态
        非静态方法能访问所有


* */
public class Student {
    String name;
    int age;
    static String teacherName;

    //this->表示当前方法调用者的地址值
    public void show1(Student this) {
        //方法内没有与成员变量重名,this可省略
        System.out.println("this" + this);
        System.out.println(this.name + ", " + age + ", " + teacherName);

        //调用其他方法
        this.show2();
        this.method();
        method();
    }

    public void show2() {
        System.out.println("show2");
    }

    public static void method() {
        //无法调用其他方法,只能调用静态
        //this.show1();
        // this.name
        System.out.println("静态方法");
    }
}
