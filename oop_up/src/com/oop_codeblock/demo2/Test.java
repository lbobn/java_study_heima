package com.oop_codeblock.demo2;

public class Test {
    public static void main(String[] args) {
        //静态代码块只在第一次创建对象时执行一次
        Student s1 = new Student();

        Student s2 = new Student();
    }
}
