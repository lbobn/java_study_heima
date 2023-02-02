package com.oop_abstract.demo1;

public class Test {
    public static void main(String[] args) {
        //抽象方法抽象类
        //子类必须重写抽象方法

        Frog f = new Frog("xiaolv", 1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();
    }
}
