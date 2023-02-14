package com.a03genericsdemo.test;

public class PersianCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫" + getName() + "的，" + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
