package com.Innerclass.demo4;

public class Outer {
    int b = 20;

    public void show() {
        int a = 10;

        //局部内部类
        class Inner {
            String name;
            int age;

            public void method() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method方法");
            }

            public static void show() {
                System.out.println("局部内部类中的静态show方法");
            }
        }


        //创建局部内部类对象
        Inner i = new Inner();
        i.method();
        Inner.show();

    }

}
