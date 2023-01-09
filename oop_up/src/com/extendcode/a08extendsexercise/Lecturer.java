package com.extendcode.a08extendsexercise;

public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("教书");
    }
}
