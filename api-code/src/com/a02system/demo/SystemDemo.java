package com.a02system.demo;

public class SystemDemo {
    public static void main(String[] args) {
        //计算机时间原点  1970年1月1日 0:0:0  中国  1970年1月1日 8:0:0
        //currentTimeMillis()  返回系统时间，以毫秒显示
        System.out.println(System.currentTimeMillis());


        //arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)
        //1.数据源数组与目的地数组若都为基本数据类型，需要两者类型相同
        //2.拷贝需要考虑数组长度
        //3.若都为引用数据类型，子类可以赋值给父类
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];

        System.arraycopy(arr1, 0, arr2, 0, 10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


        //exit() 终止虚拟机运行
        //System.exit(0);
        //System.out.println("测试此行代码是否执行");


    }
}
