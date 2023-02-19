package com.a02charset;

import java.io.FileInputStream;
import java.io.IOException;

public class CharSetDemo1 {
    public static void main(String[] args) throws IOException {
        /*
           字节流读取中文会出现乱码

           而用字符流拷贝不会出错
        */
        FileInputStream fis = new FileInputStream("z08-io-code\\c.txt");

        int len;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }

        fis.close();
    }
}
