package com.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
        //构造
        //BigInteger(int num,Random rnd)        获取随机大整数，[0~2的num次方]
        Random r = new Random();
        BigInteger bi1 = new BigInteger(4, r);
        System.out.println(bi1);

        //BigInteger(String val)        获取指定大整数
        BigInteger bi2 = new BigInteger("99999999999999999999999999999");
        System.out.println(bi2);


        //BigInteger(String val,int radix)        获取指定进制大整数
        BigInteger bi3 = new BigInteger("0101011101", 2);
        System.out.println(bi3);

        //valueOf(long val)         静态方法获取(不能超出long范围)
        // (内部对-16~16做了优化，提前创建了他们的对象，若重复获取不会重复创建新对象)
        BigInteger bi4 = BigInteger.valueOf(15);
        System.out.println(bi4);

    }
}
