package com.a06threadpool.demo2;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        //向Java虚拟机返回可用处理器的数目
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("可用处理器数目" + count);
    }
}
