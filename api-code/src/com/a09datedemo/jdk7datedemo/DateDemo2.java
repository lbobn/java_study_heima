package com.a09datedemo.jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        /*
         * 需求1：打印时间原点开始一年后的时间
         * 需求2：定义两个Date对象,比较哪个在前，哪个在后*/

        Date d1 = new Date(0L);
        long l = d1.getTime() + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(l);
        System.out.println(d1);

        Random r = new Random();
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));
        long time1 = d2.getTime();
        long time2 = d3.getTime();
        if (time1 < time2) {
            System.out.println("第一个时间在前");
        } else if (time1 > time2) {
            System.out.println("第二个时间在前");
        } else {
            System.out.println("两个时间一样");
        }

    }
}
