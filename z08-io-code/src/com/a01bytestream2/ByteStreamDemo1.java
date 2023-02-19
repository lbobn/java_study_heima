package com.a01bytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * 演示：字节输入流FileInputStream
         * 实现需求：读取文件中的数据。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *       读取数据
         *       释放资源
         * */
        //1.创建对象
        FileInputStream fis = new FileInputStream("z08-io-code\\a.txt");

        int r1 = fis.read();
        System.out.println((char) r1);

        int r2 = fis.read();
        System.out.println((char) r2);
        int r3 = fis.read();
        System.out.println((char) r3);
        int r4 = fis.read();
        System.out.println((char) r4);
        int r5 = fis.read();
        System.out.println((char) r5);

        fis.close();
    }
}
