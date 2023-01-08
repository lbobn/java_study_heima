package com.extendcode.a05extendsdemo;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        //先调用父类的无参构造，再子类

        Student s2 = new Student("zhangsan", 23);
        System.out.println(s2.name + ", " + s2.age);

    }
}
