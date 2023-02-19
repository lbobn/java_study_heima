package com.a01bytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
         *   练习：
         *       文件拷贝
         *       把D:\Test\test.mp4 [23.8 MB (24,984,597 字节) ]拷贝到当前模块下。
         *
         * */


        long start = System.currentTimeMillis();

        //1.创建对象
        FileInputStream fis = new FileInputStream("D:\\Test\\test.mp4");
        FileOutputStream fos = new FileOutputStream("z08-io-code\\copy.mp4");
        //2.拷贝
        byte[] bytes = new byte[1024 * 1024 * 2];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        //3.释放资源
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);//23ms
    }
}
