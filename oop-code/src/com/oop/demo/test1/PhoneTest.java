package com.oop.demo.test1;

import com.oop.demo.test1.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="小米";
        p.price=1999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.play();
    }
}
