package com.extendcode.a08extendsexercise;

public class Employee {
    private String num;
    private String name;

    public Employee() {
    }

    public Employee(String num, String name) {
        this.num = num;
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("工作");
    }
}
