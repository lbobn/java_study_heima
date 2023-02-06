package com.a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //底层存储
        //最高位符号位,接着每32位一分,将分组后结果存到数组

        //对象一经创建不能修改其值
        BigInteger bi1 = new BigInteger("10");
        BigInteger bi2 = new BigInteger("3");
        //加
        BigInteger add = bi1.add(bi2);
        System.out.println(add);
        //减
        BigInteger subtract = bi1.subtract(bi2);
        System.out.println(subtract);
        //乘
        BigInteger multiply = bi1.multiply(bi2);
        System.out.println(multiply);
        //除法
        BigInteger divide1 = bi1.divide(bi2);//商
        BigInteger[] devideAndRemainder = bi1.divideAndRemainder(bi2);//商和余数
        System.out.println(divide1);
        System.out.println(devideAndRemainder[0]);
        System.out.println(devideAndRemainder[1]);
        //比较是否相同
        System.out.println(bi1.equals(bi2));
        //次幂
        System.out.println(bi1.pow(2));
        //大小
        System.out.println(bi1.max(bi2));
        System.out.println(bi1.min(bi2));
        //强转int,超范围报错
        int i = bi1.intValue();

    }
}
