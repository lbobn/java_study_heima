package com.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
        */


        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\com\\test\\test3.txt"));
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = br.read()) != -1) {
            sb.append((char) ch);
        }
        br.close();

        String str = sb.toString();
        String[] strArr = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strArr) {
            list.add(Integer.parseInt(s));
        }

        Collections.sort(list);
        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("z08-io-code\\src\\com\\test\\test3.txt"));
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                bw.write(list.get(i) + "");
            } else {
                bw.write(list.get(i) + "-");
            }
        }
        bw.close();

    }
}
