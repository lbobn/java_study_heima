package com.mystatic.a05staticdemo;

public class Main {
    public static void main(String[] args) {
        //main()方法中的参数是旧版本jdk用于从键盘输入
        //后面没什么用,只是为了兼容老版本而保留

        //[]:数组
        //String:数据类型
        //args:数组名

        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
