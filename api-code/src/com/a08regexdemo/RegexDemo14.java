package com.a08regexdemo;

public class RegexDemo14 {
    public static void main(String[] args) {
        //分组妙用
        //口吃替换
        String str = "我要学学编编编编程程程程程";
        //需求 ：把重复的内容替换为单个的

        //(.):表示把重复内容的第一个字符看做一组
        //\\1:表示第一个字符再次出现
        //+:至少一次
        //$1: 表示把正则表达式第一组的内容拿出来再用
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
