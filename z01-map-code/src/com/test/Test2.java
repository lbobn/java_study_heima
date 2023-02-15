package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*班级里有N个学生要求:
            70%的概率随机到男生
            30%的概率随机到女生
        "范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群" ,"朱穆朗玛峰"，
        "杜琦燕","袁明媛","李猜","田蜜蜜"，
        */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        //打乱数据
        Collections.shuffle(list);

        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);

        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李猜", "田蜜蜜");
        if (number == 1) {
            int boyIndex = r.nextInt(boyList.size());
            String s = boyList.get(boyIndex);
            System.out.println(s);
        } else {
            int girlIndex = r.nextInt(girlList.size());
            String s = girlList.get(girlIndex);
            System.out.println(s);
        }


    }
}
