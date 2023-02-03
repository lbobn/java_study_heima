package com.Innerclass.demo2;

public class Outer {
    String name;
    int a = 10;

    //成员内部类
    class Inner {
        int a = 20;

        public void show() {
            int a = 30;
            //当变量名重名时
            System.out.println(Outer.this.a);//外部类变量
            System.out.println(this.a);//内部类变量
            System.out.println(a);//局部变量
        }

    }
}
