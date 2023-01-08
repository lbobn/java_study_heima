package com.extendcode.a05extendsdemo;

public class Student extends Person {
    public Student() {
        //super()必须在子类构造函数第一行,没写虚拟机会自动加
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age) {

        //要调用父类有参构造需手动书写，将参数传递给super()
        super(name, age);
        System.out.println("子类的有参构造");
    }
}
