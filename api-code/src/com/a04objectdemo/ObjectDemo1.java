package com.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*toString()  返回对象的字符串表示
         * equals()    比较两个对象是否相等
         * clone()     对象克隆
         * */

        //toString()  默认转为地址值,实际使用时可重写
        //System.out.println(Object o)  方法实质就是调用类的toString方法
        Object object = new Object();
        System.out.println(object.toString());
        Student s = new Student("张三", 23);
        System.out.println(s.toString());


        // equals()    比较两个对象是否相等,默认为地址值，若需比较属性值，需重写
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));

        Student s2 = new Student("张三", 23);
        Student s3 = new Student("张三", 23);
        System.out.println(s2.equals(s3));

        String string = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(string.equals(sb));//如果sb不是字符串直接返回false
        System.out.println(sb.equals(string));//StringBuilder没有重写equals方法


    }
}
