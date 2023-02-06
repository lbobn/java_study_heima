package com.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         *getRuntime()       获取系统运行环境对象
         *exit()                 停止虚拟机
         * availableProcessors()     获取CPU线程数
         * maxMemory()           JVM能从系统获取内存总大小(单位：byte)
         * totalMemory()         JVM已经从系统获取内存总大小(单位：byte)
         * freeMemory()          JVM剩余内存大小(单位：byte)
         * exec(String command)      运行cmd命令
         * */

        //1.getRuntime()
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        //System.out.println(r1==r2);

        //2.exit()
        //r1.exit(0);

        //3.availableProcessors()       获取CPU线程数
        System.out.println(r1.availableProcessors());

        //4.maxMemory()     JVM能从系统获取内存总大小(单位：byte)
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //5.totalMemory()       JVM已经从系统获取内存总大小(单位：byte)
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //6.freeMemory()        JVM剩余内存大小(单位：byte)
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //7.exec(String command)      运行cmd命令
        //shutdown :关机
        //-s ：默认一分钟关机
        //-s -t:指定时间关机
        //-a ：取消关机
        //-r :关机并重启
        //Runtime.getRuntime().exec("notepad");
        //Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -a");
    }
}
