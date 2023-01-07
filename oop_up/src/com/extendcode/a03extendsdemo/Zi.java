package com.extendcode.a03extendsdemo;

public class Zi extends Fu {

    @Override
    public void eat() {
        System.out.println("吃午饭");
    }

    @Override
    public void drink() {
        System.out.println("喝饮料");
    }

    public void lunch() {
        eat();
        drink();

        this.eat();
        this.drink();

        super.eat();
        super.drink();

    }
}
