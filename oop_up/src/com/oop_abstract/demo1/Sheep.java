package com.oop_abstract.demo1;

public class Sheep extends Animal {
    @Override
    public void eat() {
        System.out.println("山羊在吃艹");

    }

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }
}
