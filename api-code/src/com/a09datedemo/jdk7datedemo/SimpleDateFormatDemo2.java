package com.a09datedemo.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*将：2000-11-11  转为：2000年11月11日
         * 用字符串表示*/
        //先解析为Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date time = sdf.parse("2000-11-11");
        //再格式化
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String str = sdf1.format(time);
        System.out.println(str);
    }
}
