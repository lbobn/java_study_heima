package com.map.demo;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*
        *   v put(K key ,v value)      添加元素
            v remove(object key)        根据键删除键值对元素
            void clear( )               移除所有的键值对元素
            boolean containsKey(object key)     判断集合是否包含指定的键
            boolean containsValue(object value)     判断集合是否包含指定的值
            boolean isEmpty()           判断集合是否为空
            int size()                  集合的长度，也就是集合中键值对的个数
         * */

        Map<String, String> m = new HashMap<>();

        //添加元素
        //put细节:添加,覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        m.put("脉东", "5元");
        m.put("康帅傅", "3元");
        m.put("雷碧", "3元");

        //m.put("脉东","6元");


        //删除
        //m.remove("脉东");

        //清空
        //m.clear();

        //判断是否包含
        boolean result1 = m.containsKey("康帅傅");
        System.out.println(result1);

        boolean result2 = m.containsValue("3元");
        System.out.println(result2);

        //判断空
        boolean result3 = m.isEmpty();
        System.out.println(result3);

        System.out.println(m.size());

        System.out.println(m);


    }
}
