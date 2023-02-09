package com.a10integerdemo;

public class IntegerDemo1 {
    public static void main(String[] args) {
        /*包装类*/

        //JDK5以前
        //构造方法
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("2");
        System.out.println(i1);
        System.out.println(i2);
        //静态方法（-128~127有内存优化）
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

    }
}
