package com.a09datedemo.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /*需求
         * 秒杀活动：开始：2023年11月11日 0:0:0
         *          结束：2023年11月11日 0:10:0
         *
         *
         * 小明下单时间：2023年11月11日 0:01:0
         * 小花下单时间：2023年11月11日 0:11:0
         * 代码说明两位同学有没有成功参与秒杀
         * */

        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String xiaoming = "2023年11月11日 0:01:0";
        String xiaohua = "2023年11月11日 0:11:0";

        //解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date xiaomingDate = sdf.parse(xiaoming);
        Date xiaohuaDate = sdf.parse(xiaohua);

        long startDateTime = startDate.getTime();
        long endDateTime = endDate.getTime();
        long xiaomingDateTime = xiaomingDate.getTime();
        long xiaohuaDateTime = xiaohuaDate.getTime();

        if (xiaomingDateTime > startDateTime && xiaomingDateTime < endDateTime) {
            System.out.println("小明成功参与秒杀");
        } else {
            System.out.println("小明没有成功参与秒杀");
        }

        if (xiaohuaDateTime > startDateTime && xiaohuaDateTime < endDateTime) {
            System.out.println("小花成功参与秒杀");
        } else {
            System.out.println("小花没有成功参与秒杀");
        }

    }
}
