package com.Test;

public class Test3 {
    public static void main(String[] args) {
        /*猴子吃桃子
         * 一堆桃子,猴子第一天吃了一半还多一个
         * 第二天吃了剩下桃子的一半还多一个,以此类推
         * 第十天(还没吃)发现只剩一个桃子,最初有多少桃子*/

        /*
         * day10: 1
         * day9 : (1+1)*2=4
         * day8 : (4+1)*2=10*/
        System.out.println(getCount(1));

    }

    public static int getCount(int day) {
        if (day <= 0 || day >= 11) {
            System.out.println("时间错误");
            return -1;
        }
        //递归出口
        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
