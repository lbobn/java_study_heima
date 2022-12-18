package com.lianxi.array;

public class demo {
    public static void main(String[] args) {
        //数组

        //静态初始化
        int[] a=new int[]{1,2,3,4,5};//完整格式
        int[] b ={1,2,3,4,5};//简化格式

        int c[]={1,2,3,4,5};//C语言样式
        //动态初始化
        /*
        * int:0
        * double:0.0
        * char:'\u0000'
        * boolean:false
        * 引用:null  */
        int[] d=new int[5];
        d[2]=9;
        System.out.println(a[1]);

        System.out.println(d[1]);//2
        System.out.println(d[2]);//0

        //[:数组      I:int   @:标志    地址:776ec8df(十六进制)
        System.out.println(b);//[I@776ec8df

        // 遍历
        // 数组长度a.length
        // a.fori
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
