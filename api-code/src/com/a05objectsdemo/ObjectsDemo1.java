package com.a05objectsdemo;

import com.a04objectdemo.Student;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        //Objects

        /*equals()       先做非空判断，在比较
         *isNull()        判断是否为null,是null返回true
         * nonNull()      与上条相反
         * */

        Student s1 = new Student();
        Student s2 = null;

        //不能用null调用方法
        //System.out.println(s2.equals(s1));

        System.out.println(Objects.equals(s1, s2));
        System.out.println("--------------------");
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

    }
}
