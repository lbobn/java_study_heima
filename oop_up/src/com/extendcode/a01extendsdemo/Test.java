package com.extendcode.a01extendsdemo;

public class Test {
    public static void main(String[] args) {

        /*
         * 1. Java只能单继承，不能多继承、但是可以多层继承。
         * 2. Java中所有的类都直接或者间接继承于Object类。
         * 3．子类只能访问父类中非私有的成员*/

        //创建布偶猫对象，
        Ragdoll rd = new Ragdoll();
        rd.eat();//间接父类animal的方法
        rd.drink();//间接父类animal的方法
        rd.catchMouse();//直接父类cat的方法

        //创建哈士奇对象
        Husky h = new Husky();
        h.eat();//间接父类animal的方法
        h.drink();//间接父类animal的方法
        h.lookHome();//直接父类dog的方法
        h.breakHome();//husky自己的方法
    }
}
