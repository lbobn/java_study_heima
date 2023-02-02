package com.oop_abstract.demo1;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
