package com.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
         *获取对象
         * 1构造方法
         * public BigDecimal(double val);
         * public BigDecimal(String val);
         * 2静态方法
         * BigDecimal.valueOf(double val);
         * [0~10]已创建好对象
         * */

        //1.通过double传参，可能不精确
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        //2.通过字符串传参
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);

        //静态方法获取对象
        BigDecimal bd5 = BigDecimal.valueOf(0.01);
        System.out.println(bd5);


        //没有超出double用静态方法，若已超出，用构造方法
    }
}
