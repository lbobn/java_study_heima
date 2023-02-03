package com.Innerclass.demo3;

public class Test {
    public static void main(String[] args) {
        /*静态内部类只能访问外部类中的静态变量和静态方法，如果想要访问非
        静态的需要创建对象。
        */

        //创建静态内部类对象的格式:外部类名.内部类名 对象名=new 外部类名.内部类名();

        Outer.Inner oi = new Outer.Inner();

        oi.show1();

        //调用静态方法
        Outer.Inner.show2();
        //oi.show2();

    }
}
