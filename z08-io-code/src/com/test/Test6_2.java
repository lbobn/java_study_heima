package com.test;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test6_2 {
    public static void main(String[] args) throws IOException {
        /*
                需求：把《出师表》的文章顺序进行恢复到一个新文件中。
            */


        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\com\\test\\test6\\csb.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            int number = Integer.parseInt(line.split("\\.")[0]);
            tm.put(number, line);
        }
        br.close();
        //写入数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("z08-io-code\\src\\com\\test\\test6\\result.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();

    }
}
