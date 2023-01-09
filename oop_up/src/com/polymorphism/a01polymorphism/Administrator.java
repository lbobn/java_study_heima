package com.polymorphism.a01polymorphism;

public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员的信息为" + getName() + ", " + getAge());
    }
}
