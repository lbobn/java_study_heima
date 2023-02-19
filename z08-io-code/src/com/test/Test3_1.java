package com.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test3_1 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9


           细节1：
                文件中的数据不要换行


            细节2:
                bom头
        */
        //1.读取数据
        FileReader fr = new FileReader("z08-io-code\\src\\com\\test\\test3.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        //2.排序
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
        //3.写出
        FileWriter fw = new FileWriter("z08-io-code\\src\\com\\test\\test3.txt");
        String str = Arrays.toString(arr).replace(", ", "-");
        String result = str.substring(1, str.length() - 1);
        fw.write(result);
        fw.close();


    }
}
