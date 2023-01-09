package com.extendcode.a08extendsexercise;

public class AdminStaff extends Employee {

    public AdminStaff() {
    }

    public AdminStaff(String num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("行政部工作");
    }
}
