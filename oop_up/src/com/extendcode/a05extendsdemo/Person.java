package com.extendcode.a05extendsdemo;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        System.out.println("父类的有参构造");
        this.name = name;
        this.age = age;
    }
}
