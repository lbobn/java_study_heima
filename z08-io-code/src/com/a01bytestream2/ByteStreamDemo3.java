package com.a01bytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
             字节输入流循环读取
         */

        //1.创建对象
        FileInputStream fis = new FileInputStream("z08-io-code\\a.txt");

        int b;
        //read :表示读取数据，而且是读取一个数据就移动一次指针
        //必须用变量存储
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        fis.close();
    }
}
