package com.oop.demo.test2;

public class Girlfriend {
    private String name;
    private int age;
    private double weigh;

    //对于每个私有成员变量都要提供set和get方法


    //this指成员变量
    //引用变量遵循就近原则
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("数值不合法");
        }

    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
