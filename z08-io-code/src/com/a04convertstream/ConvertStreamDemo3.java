package com.a04convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件，转成UTF-8
        */
        //1.JDK11以前的方案
        /*InputStreamReader isr=new InputStreamReader(new FileInputStream("z08-io-code\\src\\com\\a04convertstream\\gbkfile.txt"),"GBK");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("z08-io-code\\src\\com\\a04convertstream\\utffile.txt"),"UTF-8");
        int ch;
        while ((ch=isr.read())!=-1){
            osw.write(ch);
        }
        osw.close();
        isr.close();*/

        //替代方案
        FileReader fr = new FileReader("z08-io-code\\src\\com\\a04convertstream\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("z08-io-code\\src\\com\\a04convertstream\\utffile.txt", Charset.forName("UTF-8"));
        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();

    }
}
