package com.extendcode.a04extendsdemo;

public class ChineseDog extends Dog {
    //父类的方法不满足需求，需要重写


    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
