package com.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        /*
         * add() 加
         * subtract()    减
         * multiply()    乘
         * divide()      除
         * divide(BigDecimal,精确几位, 舍入模式)
         * */

        BigDecimal bd1 = BigDecimal.valueOf(15.0);
        BigDecimal bd2 = BigDecimal.valueOf(4.0);


        System.out.println(bd1.add(bd2));

        System.out.println(bd1.subtract(bd2));

        System.out.println(bd1.multiply(bd2));

        System.out.println(bd1.divide(bd2));

        System.out.println(bd1.divide(bd2, 1, RoundingMode.HALF_UP));

    }
}
