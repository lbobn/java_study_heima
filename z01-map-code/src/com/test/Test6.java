package com.test;

import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        /*集合嵌套*/
        //需求
        //定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
        //添加完毕后，遍历结果格式如下:
        // 江苏省=南京市，扬州市，苏州市，无锡市，常州市
        // 湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
        // 河北省=石家庄市，唐山市，邢台市，保定市，张家口市

        TreeMap<String, ArrayList<String>> city = new TreeMap<>();

        ArrayList<String> jiangsu = new ArrayList<>();
        Collections.addAll(jiangsu, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> hubei = new ArrayList<>();
        Collections.addAll(hubei, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        ArrayList<String> hebei = new ArrayList<>();
        Collections.addAll(hebei, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        city.put("江苏省", jiangsu);
        city.put("湖北省", hubei);
        city.put("河北省", hebei);

        Set<Map.Entry<String, ArrayList<String>>> entries = city.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();

            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String s : value) {
                sj.add(s);
            }

            System.out.println(key + " = " + sj);
        }
    }
}
