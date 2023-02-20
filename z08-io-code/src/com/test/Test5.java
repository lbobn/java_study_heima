package com.test;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {

        /*23.8 MB (24,984,597 字节)*/
        long start = System.currentTimeMillis();
        //method1();
        method2();//0.069秒
        //method3();
        //method4();//0.027秒
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "秒");
    }

    //字节流的基本流：一次读写一个字节              4,588,568,576 字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Test\\test.mp4");
        FileOutputStream fos = new FileOutputStream("z08-io-code\\src\\com\\test\\test5.mp4");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    //字节流的基本流：一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Test\\test.mp4");
        FileOutputStream fos = new FileOutputStream("z08-io-code\\src\\com\\test\\test5.mp4");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }

    //字节流的缓冲流：一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Test\\test.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("z08-io-code\\src\\com\\test\\test5.mp4"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }

    //字节流的缓冲流：一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Test\\test.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("z08-io-code\\src\\com\\test\\test5.mp4"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
