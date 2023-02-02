package com.oop_interface.example;

public abstract class Coach extends People {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
