package com.map.demo;

import java.util.StringJoiner;
import java.util.TreeMap;

public class A03_TreeMapDemo3 {
    public static void main(String[] args) {
        String str = "abcedabceecdabadeacdebacadc";

        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (tm.containsKey(c)) {
                Integer count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }


        //遍历集合，并按照指定格式输出
        /*StringBuilder sb=new StringBuilder();
        tm.forEach((key,value)->sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);*/

        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(")"));
        System.out.println(sj);
    }
}
