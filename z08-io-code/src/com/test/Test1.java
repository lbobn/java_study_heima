package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹

        //1.创建对象表示数据源
        File src = new File("z07-file-code\\aaaaaa");
        //2.创建对象表示目的地
        File dest = new File("z08-io-code\\src\\com\\test\\test1_demo");

        //调用方法开始拷贝
        copyDir(src, dest);
    }

    private static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();
        //递归
        //1.进入数据源
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            if (file.isFile()) {
                //如果是文件则拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                //如果是文件夹则递归
                copyDir(file, new File(dest, file.getName()));
            }
        }

    }
}
