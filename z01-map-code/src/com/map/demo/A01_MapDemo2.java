package com.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A01_MapDemo2 {
    public static void main(String[] args) {
        /*
         *   Map集合的遍历1
         *   //通过键找值
         * */

        Map<String, String> m = new HashMap<>();


        m.put("脉东", "5元");
        m.put("康帅傅", "3元");
        m.put("雷碧", "3元");

        //获取所有键,放到一个单列集合中
        Set<String> keys = m.keySet();
        //循环遍历,得到每一个键
        for (String key : keys) {
            //利用map集合中的键获取对应值   get
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------");
        //迭代器
        Set<String> keys1 = m.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------");
        //Lambda
        Set<String> keys2 = m.keySet();
        keys2.forEach(key -> {
            String value = m.get(key);
            System.out.println(key + "=" + value);
        });


    }
}
