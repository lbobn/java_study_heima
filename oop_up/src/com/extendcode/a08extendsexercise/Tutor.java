package com.extendcode.a08extendsexercise;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("教学指导,找工作指导");
    }
}
