package com.filedemo;

import java.io.File;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) {
        //public File[] listFiles()       获取当前该路径下所有内容
        File f1 = new File("z07-file-code\\file");
        //作用：获取file文件夹里面的所有内容，把所有的内容放到数组中返回
        File[] arr = f1.listFiles();
        for (File file : arr) {
            System.out.println(file);
        }
    }
}
