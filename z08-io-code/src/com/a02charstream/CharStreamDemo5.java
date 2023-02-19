package com.a02charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /*
        缓存区数据满了会自动写入硬盘
        手动：flush或关闭流
        * */
        FileWriter fw = new FileWriter("z08-io-code\\c.txt");

        fw.write("hello");
        fw.write("world");
        //刷新缓存区，让缓存区数据写到磁盘
        fw.flush();
        fw.write("Nice");
        fw.write("to");
        fw.write("meet");
        fw.write("you");

        fw.close();

    }
}
