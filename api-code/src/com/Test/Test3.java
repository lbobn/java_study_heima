package com.Test;

public class Test3 {
    public static void main(String[] args) {
        /*
         * 定义方法自己实现toBinaryString()方法，将一个整数转为字符串表示的二进制
         * */
        System.out.println(toBinaryString(6));

        System.out.println(Integer.toBinaryString(6));
    }

    public static String toBinaryString(int number) {
        //不断除以2取余数
        //倒着拼接余数
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (number == 0) {
                break;
            }

            //获取余数
            int remainder = number % 2;
            sb.insert(0, remainder);
            //除以2
            number = number / 2;
        }
        return sb.toString();
    }
}
