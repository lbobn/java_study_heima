package com.a07zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         *   解压缩流
         *
         * */
        //1.创建一个File表示要解压的压缩包
        File src = new File("z08-io-code\\src\\com\\a07zipstream\\aaa.zip");
        //2.创建一个File表示解压的目的地
        File dest = new File("z08-io-code\\src\\com\\a07zipstream\\");
        unzip(src, dest);
    }

    public static void unzip(File src, File dest) throws IOException {
        //解压的本质：把压缩包里面的每一个文件或者文件夹读取出来，按照层级拷贝到目的地当中
        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //要先获取到压缩包里面的每一个zipentry对象
        //表示当前在压缩包中获取到的文件或者文件夹
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                //文件夹：需要在目的地dest处创建一个同样的文件夹
                File f = new File(dest, entry.toString());
                f.mkdirs();
            } else {
                //文件：需要读取到压缩包中的文件，并把他存放到目的地dest文件夹中（按照层级目录进行存放）
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    //写到目的地
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的一个文件处理完毕了。
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
