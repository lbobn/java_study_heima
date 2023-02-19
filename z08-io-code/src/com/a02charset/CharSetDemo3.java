package com.a02charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
       Java中编码的方法
            public byte[] getBytes()                        使用默认方式进行编码
            public byte[] getBytes(String charsetName)      使用指定方式进行编码

        Java中解码的方法
            String(byte[] bytes)                            使用默认方式进行解码
            String(byte[] bytes, String charsetName)        使用指定方式进行解码

            ASCII:一个字节表示一个字母
            GBK  :一个字节表示一个英文字母，两个字节表示中文
            Unicode:一个字节表示一个英文字母，三个字节表示中文
            表示中文的第一个字节为1开头，而英文为0开头
        */


        //1.编码
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();//默认为Unicode的UTF-8
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //2.解码
        String str1 = new String(bytes1);
        String str2 = new String(bytes1, "GBK");
        System.out.println(str1);
        System.out.println(str2);
    }
}
