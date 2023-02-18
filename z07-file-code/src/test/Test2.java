package test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        /*需求：
             定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
	        （暂时不需要考虑子文件夹）
        */
        File f1 = new File("z07-file-code\\aaa\\bbb");
        boolean b = haveAVI(f1);
        System.out.println(b);
    }

    /*
     * 作用：用来找某一个文件夹中，是否有以avi结尾的电影
     * 形参：要查找的文件夹
     * 返回值：查找的结果  存在true  不存在false
     * */
    public static boolean haveAVI(File file) {
        //1.进入aaa文件夹，而且要获取里面所有的内容
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }
}
