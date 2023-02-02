package com.oop_interface.example;

public abstract class Player extends People {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
