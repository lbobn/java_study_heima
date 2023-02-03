package com.Innerclass.demo5;

public class Test {
    public static void main(String[] args) {

        //匿名内部类适用于只使用一次


        //借口则为实现，
        //匿名内部类,实际为借口实现的对象，括号内才是没有名字的类
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写的swim方法");
            }
        };
        //类则为继承
        new Animal() {

            @Override
            public void eat() {
                System.out.println("重写的eat方法");
            }
        }.eat();//可直接链式使用

        //多态，调用方法
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("吃骨头");
                    }
                }

        );
    }

    public static void method(Animal a) {
        a.eat();
    }
}
