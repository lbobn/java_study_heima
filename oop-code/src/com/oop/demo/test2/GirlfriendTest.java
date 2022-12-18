package com.oop.demo.test2;

public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend gf1=new Girlfriend();
        gf1.name="纳西妲";
        gf1.age=18;
        gf1.weigh=50;
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.weigh);
        gf1.sleep();
        gf1.eat();
        System.out.println("====================");
        Girlfriend gf2=new Girlfriend();
        gf2.name="xiaogong";
        gf2.age=19;
        gf2.weigh=50;
        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.weigh);
        gf2.sleep();
        gf2.eat();

    }
}
