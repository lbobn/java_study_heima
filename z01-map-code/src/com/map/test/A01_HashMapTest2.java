package com.map.test;

import java.util.*;

public class A01_HashMapTest2 {
    public static void main(String[] args) {
        //某个班级88名学生，现在需要组成秋游活动，
        // 班长提供了四个景点依次是（A、B、C、D) ,
        //每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。

        //随机数模拟投票
        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //定义HashMap作为计数器,
        HashMap<String, Integer> hm = new HashMap<>();

        for (String name : list) {
            if (hm.containsKey(name)) {
                Integer count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }
        }

        System.out.println(hm);

        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println(max);

        //打印投票最多景点
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
