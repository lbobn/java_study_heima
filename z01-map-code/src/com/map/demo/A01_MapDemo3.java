package com.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A01_MapDemo3 {
    public static void main(String[] args) {
        /*
         *   Map集合的遍历2
         *   //通过 键值对对象
         * */

        Map<String, String> m = new HashMap<>();


        m.put("脉东", "5元");
        m.put("康帅傅", "3元");
        m.put("雷碧", "3元");

        //通过一个方法获取所有键值对对象,返回一个Set集合
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //遍历得到每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------");
        //迭代器
        Set<Map.Entry<String, String>> entries1 = m.entrySet();
        Iterator<Map.Entry<String, String>> it = entries1.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------");
        //Lambda
        Set<Map.Entry<String, String>> entries2 = m.entrySet();
        entries2.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        });

    }
}
