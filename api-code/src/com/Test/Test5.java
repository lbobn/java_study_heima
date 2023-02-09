package com.Test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断任意一年是闰年还是平年

        //JDK7
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);//月份范围0~11
        //把日历减一天
        c.add(Calendar.DAY_OF_MONTH, -1);

        int i = c.get(Calendar.DAY_OF_MONTH);
        if (i == 28) {
            System.out.println("是平年");
        } else {
            System.out.println("是闰年");
        }

        //JDK8
        LocalDate ld = LocalDate.of(2000, 3, 1);
        //把日历减一天
        LocalDate localDate = ld.minusDays(1);
        int day = localDate.getDayOfMonth();
        if (day == 28) {
            System.out.println("是平年");
        } else {
            System.out.println("是闰年");
        }

        boolean leapYear = ld.isLeapYear();
        System.out.println(leapYear);

    }
}
