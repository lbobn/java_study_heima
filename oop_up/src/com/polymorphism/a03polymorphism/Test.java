package com.polymorphism.a03polymorphism;

public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();
        //多态弊端：父类变量无法调用子类的特有方法
        a.eat();

        //解决：强转为子类
        // Dog d=(Dog) a;
        //转换类型与真实类型不一致会报错
        if (a instanceof Dog d) {
            d.lookHome();
        } else if (a instanceof Cat c) {
            c.catchMouse();

        }

    }
}

class Animal {
    String name = "动物";

    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void eat() {
        System.out.println("猫在吃小鱼干");
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}