package com.a01mathdemo;

public class MathDemo {
    public static void main(String[] args) {
        //abs() 绝对值
        //absExact() 出范围会报错
        //超出传递参数类型的范围会出错
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("-----------------------------");

        //ceil() 向上取整
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(-12.34));
        System.out.println("-----------------------------");

        //floor() 向下取整
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(-12.34));
        System.out.println("-----------------------------");

        //round() 四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(-12.34));
        System.out.println("-----------------------------");

        //max() 获取较大值
        //min() 较小值
        System.out.println(Math.max(12, 80));
        System.out.println("-----------------------------");

        //pow(double a,double b)  a的b次幂
        //sqrt() 平方根
        //cbrt() 立方根
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.cbrt(27));
        System.out.println("-----------------------------");

        //random() 返回double随机数 [0.0,1.0)
        System.out.println(Math.random());
        System.out.println("-----------------------------");


    }
}
