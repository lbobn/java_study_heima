package com.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //用代码计算你活了多少天

        //JDK7
        //计算出生年月日的毫秒值
        String birthday = "2003年1月13日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        //获取当前时间
        long todayTime = System.currentTimeMillis();
        //计算间隔天数
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2003, 1, 13);
        LocalDate ld2 = LocalDate.now();


        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);

    }
}
