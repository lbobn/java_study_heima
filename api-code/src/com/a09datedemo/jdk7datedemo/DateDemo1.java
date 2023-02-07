package com.a09datedemo.jdk7datedemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //public Date()     创建Date对象，表示当前时间
        //public Date(long date)     创建Date对象，表示指定时间

        //setTime(long time)        设置/修改毫秒值
        //getTime(long time)        获取时间对象毫秒值

        //
        Date d1 = new Date();
        //System.out.println(d1);

        Date d2 = new Date(0L);
        System.out.println(d2);

        d2.setTime(1000L);
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time);
    }
}
