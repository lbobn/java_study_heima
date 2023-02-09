package com.Test;

public class Test2 {
    /*
     * 自己实现parseInt()方法效果，不能以0 开头*/

    public static void main(String[] args) {
        String str = "123456789";

        //校验
        if (!str.matches("[^0]\\d{0,9}")) {
            System.out.println("数据格式错误");
        } else {
            System.out.println("数据格式正确");

            //定义变量用于记录结果
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;
            }

            System.out.println(number);
            System.out.println(number - 1);
        }


    }
}
