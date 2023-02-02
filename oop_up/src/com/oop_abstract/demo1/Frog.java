package com.oop_abstract.demo1;

public class Frog extends Animal {
    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
