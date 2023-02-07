package com.a08regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*校验QQ号格式
         * 规则：6~20位，不能以0开头，必须全为数字*/

        String qq = "2820843645";
        boolean result = qq.matches("[1-9]\\d{5,19}");
        System.out.println(result);

        System.out.println("12356aca56516".matches("[1-9]\\d{5,19}"));

    }
}
