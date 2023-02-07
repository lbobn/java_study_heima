package com.a09datedemo.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
         * SimpleDateFormat()        默认格式
         * SimpleDateFormat(String pattern)        指定格式
         *
         * format(Date date)         格式化(日期对象->字符串)
         * parse(String source)      解析(字符串->日期对象)
         *
         * */

        method1();

        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = sdf.parse(str);
        System.out.println(time);


    }

    private static void method1() {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date date1 = new Date(0L);
        String time1 = sdf1.format(date1);
        System.out.println(time1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        Date date2 = new Date();
        String time2 = sdf2.format(date2);
        System.out.println(time2);
    }
}
