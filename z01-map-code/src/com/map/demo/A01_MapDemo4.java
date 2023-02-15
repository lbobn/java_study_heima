package com.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A01_MapDemo4 {
    public static void main(String[] args) {
        /*
         *   Map集合的遍历3
         *   //通过 Lambda
         * */

        Map<String, String> m = new HashMap<>();


        m.put("脉东", "5元");
        m.put("康帅傅", "3元");
        m.put("雷碧", "3元");

        /*m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });*/

        m.forEach((key, value) -> System.out.println(key + "=" + value));

    }
}
