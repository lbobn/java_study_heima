package com.extendcode.a04extendsdemo;

public class SharPei extends Dog {

    //因为沙皮狗吃狗粮和骨头
    //父类的方法无法满足需求

    @Override
    public void eat() {
        super.eat();
        //System.out.println("狗在吃狗粮");
        System.out.println("狗啃骨头");
    }
}
