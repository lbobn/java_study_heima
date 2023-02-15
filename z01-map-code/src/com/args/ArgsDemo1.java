package com.args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //Jdk5
        //可变参数
        //细节：1.方法中只能写一个可变参数
        //      2.方法中除了可变参数还有其他参数时，可变参数要写在最后
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8));
    }

    public static int getSum(int... args) {
        //底层是Java创建的数组
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        return sum;
    }
}
