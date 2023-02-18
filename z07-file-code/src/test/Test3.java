package test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        /* 需求：
        找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）


        套路：
            1，进入文件夹
            2，遍历数组
            3，判断
            4，判断

        */
        File file = new File("D:\\");
        findAVI();
        //findAVI(file);
    }

    public static void findAVI() {
        //获取本地所有的盘符
        File[] files = File.listRoots();
        for (File file : files) {
            findAVI(file);
        }
    }

    public static void findAVI(File file) {
        //1.进入文件夹file
        File[] files = file.listFiles();
        if (files != null) {
            //2.遍历数组，依次得到file里面每一个文件或者文件夹
            for (File f : files) {
                //3.判断，如果是文件，就可以执行题目的业务逻辑
                if (f.isFile()) {
                    if (f.getName().endsWith(".avi")) {
                        System.out.println(f);
                    }
                } else {
                    //4，判断，如果是文件夹，就可以递归
                    //细节：再次调用本方法的时候，参数一定要是src的次一级路径
                    findAVI(f);
                }
            }
        }
    }
}
