package com.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test6_1 {
    public static void main(String[] args) throws IOException {
        /*
                需求：把《出师表》的文章顺序进行恢复到一个新文件中。
            */
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\com\\test\\test6\\csb.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        //2.排序
        //排序规则：按照每一行前面的序号进行排列
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //获取o1和o2的序号
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });
        //3.写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("z08-io-code\\src\\com\\test\\test6\\result.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();


    }
}
