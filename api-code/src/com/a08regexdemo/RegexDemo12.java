package com.a08regexdemo;

public class RegexDemo12 {
    public static void main(String[] args) {
        /*
         * replaceAll(String regex,String newArr)   按正则表达式规则替换
         * split(String regex)                   按正则表达式规则切割字符串
         *
         * */
        //需求： 将名字中间串替换为vs
        //需求2：将三个姓名切割出来
        String str1 = "小明svdbbjhvhsebci254898小红bjwchcve6rb5gr小花";


        String result1 = str1.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);


        String str2 = "小明svdbbjhvhsebci254898小红bjwchcve6rb5gr小花";
        String[] arr = str2.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
