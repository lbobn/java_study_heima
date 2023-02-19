package com.a01bytestream1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * 演示：字节输出流FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *       写出数据
         *       释放资源
         * */
        FileOutputStream fos = new FileOutputStream("z08-io-code\\a.txt");

        fos.write(97);

        fos.close();
    }
}
