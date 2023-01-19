package com.oopfinal.test1;

public class Test {
    public static void main(String[] args) {
        //final修饰基本数据类型，其值不可改变
        //final修饰引用数据类型，其地址不可改变，而其内容可改变


        final Student s = new Student();
        s.setName("张三");
        s.setAge(23);

        System.out.println(s.getName() + ", " + s.getAge());
    }
}
