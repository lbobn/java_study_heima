package com.a10integerdemo;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //在以前包装类计算
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);

        //拆箱再装箱
        int result1 = i1.intValue() + i2.intValue();
        System.out.println(result1);

        //JDK5提出自动拆箱装箱
        Integer i3 = 1;
        Integer i4 = 2;
        int result2 = i3 + i4;
        System.out.println(result2);
    }
}
