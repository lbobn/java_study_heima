package com.extendcode.a02extendsdemo;

public class Zi extends Fu {

    String name = "子";
    int age = 25;

    public void function() {


        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);

        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
