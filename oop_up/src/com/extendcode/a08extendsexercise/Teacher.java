package com.extendcode.a08extendsexercise;

public class Teacher extends Employee {

    public Teacher() {

    }

    public Teacher(String num, String name) {
        super(num, name);

    }

    @Override
    public void work() {
        System.out.println("教研部工作");
    }
}
