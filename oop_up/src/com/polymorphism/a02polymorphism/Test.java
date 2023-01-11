package com.polymorphism.a02polymorphism;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //Fu f=new Zi();
        Animal a = new Dog();
        //调用成员变量：编译看左边，运行也看左边
        //编译看左边：Javac编译代码的时候，会看左边父类中有没有这个变量，如果有，则编译成功，如果没有编译失败
        //运行也看左边：Java运行代码的时候，实际获取的就是左边父类中成员变量的值
        System.out.println(a.name);//动物

        //调用成员方法:编译看左边，运行看右边
        //编译看左边：Javac编译代码的时候，会看左边父类中有没有这个方法，如果有，则编译成功，如果没有编译失败
        //运行也看左边：Java运行代码的时候，实际运行的是子类中的方法
        a.show();

        //理解
        //Animal a =new Dog();
        //Dog d=new Dog();
        //a是Animal，默认会从Animal中找
    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal---show方法");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog---show方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat---show方法");
    }
}
