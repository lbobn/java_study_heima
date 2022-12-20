package com.oop.demo.test2;

public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend gf1 = new Girlfriend();
        gf1.setName("xiaogong");
        gf1.setAge(18);
        gf1.setWeigh(50);

        int age = gf1.getAge();     //Ctrl+Alt+V自动生成左边

        System.out.println(gf1.getName());
        System.out.println(age);
        System.out.println(gf1.getWeigh());

        gf1.sleep();
        gf1.eat();


    }
}
