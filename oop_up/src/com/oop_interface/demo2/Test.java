package com.oop_interface.demo2;

public class Test {
    public static void main(String[] args) {
        //类和接口的关系:实现关系,
        //可以单实现,也可多实现,也可在继承父类的时候多实现
        InterImpl ii = new InterImpl();

        ii.method1();
        ii.method2();
        ii.method3();
        ii.method4();
    }


}
