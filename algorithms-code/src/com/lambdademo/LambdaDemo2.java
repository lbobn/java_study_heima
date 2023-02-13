package com.lambdademo;

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*1.Lambda表达式可以简化匿名内部类的书写
         * 2.只能简化函数式接口的匿名内部类
         * 3.函数式接口：有且仅有一个抽象方法的接口，接口上方可以加@FunctionInterface注解*/


        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳~~~");
            }
        });

        //利用Lambda改写
        method(
                () -> {
                    System.out.println("游泳~~~");
                }
        );

    }

    public static void method(Swim swim) {
        swim.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}
