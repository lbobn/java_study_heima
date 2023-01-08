package com.extendcode.a04extendsdemo;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();
    }
}
