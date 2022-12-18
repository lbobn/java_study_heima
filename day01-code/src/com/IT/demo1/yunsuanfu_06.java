package com.IT.demo1;


public class yunsuanfu_06 {
    public static void main(String[] args){
        System.out.println(3.7 + "abc");//"3.7abc"
        System.out.println("abc" + true);//"abcture"
        System.out.println('中' + "abc" + true);//"中abctrue"
        int age = 18;
        System.out.println("我的年龄是" + age + "岁");//我的年龄是18岁
        System.out.println("我的年龄是" + "age" + "岁");//我的年龄是age岁
        System.out.println(1 + 2 + "abc" + 2 + 1);//3abc21


        char c = 'a';
        int result = c + 1;
        System.out.println(result);
        String x = "29";
        System.out.println(x);
    }
}
