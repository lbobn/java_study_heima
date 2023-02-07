package com.a08regexdemo;

public class RegexDemo13 {
    public static void main(String[] args) {
        //非捕获分组
        //(?:正则)  (?=正则)  (?!正则)这些仅仅是把数据括起来，不占用分组号
        //捕获分组
        //需求1：判断一个字符串开始字符和结束字符是否一致？只考虑一个字符
        //例：a123a   b456b   17891   &abc&   a123b(false)
        //  \\组号 ：表示把第x组的内容拿出来再用一次
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));
        System.out.println("----------------------------");

        //需求2：判断一个字符串开始字符和结束字符是否一致？可以有多个字符
        //例：abc123abc  b456b   123789123   &!@abc&!@   abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));
        System.out.println("----------------------------");


        //需求2：判断一个字符串开始字符和结束字符是否一致？开始部分内部每个字符也要一致
        //例：aaa123aaa  bbb456bbb   111789111   &&abc&&   aaa123aab(false)

        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex2));
        System.out.println("bbb456bbb".matches(regex2));
        System.out.println("111789111".matches(regex2));
        System.out.println("&&abc&&".matches(regex2));
        System.out.println("aaa123aab".matches(regex2));
        System.out.println("----------------------------");
    }
}
