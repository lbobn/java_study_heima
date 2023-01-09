package com.extendcode.a07extendsdemo;

public class Manager extends Employee {
    private double bonus;

    public Manager() {

    }


    //父类+子类
    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

}
