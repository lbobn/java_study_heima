package com.extendcode.a01extendsdemo;

public class Test {
    public static void main(String[] args) {

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
