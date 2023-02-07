package com.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
    public static void main(String[] args) {
        //爬虫
        /*本地爬取
         * 要求:找到已知文本中的所有JavaXX*/

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern表示正则表达式
        //Matcher：文本匹配器，按照正则表达式的规则去读取字符串，从头开始读取
        //          在大串中找符合规则的子串

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器对象
        Matcher m = p.matcher(str);
        //从头开始读取,没有满足规则的子串返回false
        //              否则返回true，并在底层记录子串的起始索引和结束索引+1

        /*boolean b = m.find();*/

        //底层通过记录的索引截取
        // 字符串的subString()截取，包头不包尾

       /* String s1 = m.group();
        System.out.println(s1);*/

        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }


    }

}
