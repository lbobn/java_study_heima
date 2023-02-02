package com.oop_interface.example;

public class BasketballPlayer extends Player {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学篮球");
    }
}
