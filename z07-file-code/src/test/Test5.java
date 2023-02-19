package test;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        /*需求：
            统计一个文件夹的总大小
      */
        File file = new File("z07-file-code\\aaaaa");

        long len = getLen(file);
        System.out.println(len);//40636
    }

    /*
     * 作用：
     *       统计一个文件夹的总大小
     * 参数：
     *       表示要统计的那个文件夹
     * 返回值：
     *       统计之后的结果
     *
     * 文件夹的总大小：
     *       说白了，文件夹里面所有文件的大小
     * */
    public static long getLen(File file) {
        File[] files = file.listFiles();
        //定义变量进行累加
        long len = 0;
        for (File f : files) {
            //是文件则累加它的大小
            if (f.isFile()) {
                len = len + f.length();
            } else {
                //文件夹则调用递归
                len = len + getLen(f);
            }
        }
        return len;
    }
}
