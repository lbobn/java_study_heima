package com.a03bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
         *
         *    字符缓冲输出流
         *      构造方法：
         *           public BufferedWriter(Writer r)
         *      特有方法：
         *           public void newLine()      跨平台的换行
         *
         * */


        //1.创建字符缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("z08-io-code\\bufferedcopy"));
        //2.写出数据
        bw.write("123");
        bw.newLine();
        bw.write("456");
        bw.newLine();
        //3.释放资源
        bw.close();
    }
}
