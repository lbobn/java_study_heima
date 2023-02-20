package com.a04convertstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
        */


        //1.创建转换流的对象
        /*OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("z08-io-code\\src\\com\\a04convertstream\\gbk.txt"),"GBK");
        osw.write("你好你好");
        osw.close();*/

        FileWriter fw = new FileWriter("z08-io-code\\src\\com\\a04convertstream\\gbk.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();

    }
}
