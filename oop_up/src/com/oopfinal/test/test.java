package com.oopfinal.test;

public class test {
    public static void main(String[] args) {
        /*final修饰类，方法，变量，意为最终，即不可继承，重写和修改*/
        final int a = 3;
        System.out.println(a);
    }
}

class Fu {
    public void show() {
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu {
    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
}