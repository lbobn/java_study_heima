package com.it.studentsystemPlus;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String code = getCode();
        System.out.println(code);
    }

    public static String getCode() {
        //1.创建集合添加所有大写小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //随机抽取4个字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        //生成随机数
        int number = r.nextInt(10);
        sb.append(number);
        //将随机数与随机索引的字符交换位置
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        //交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }
}
