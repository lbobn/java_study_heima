package com.alltest.First;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        /*开发验证码
        * 定义方法实现随机生成5位验证码
        * 格式: 1）长度为5
        *       2）前四位是大写或小写字母
        *       3）最后一位是数字。*/


        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<26){
                //增加小写字母
                chs[i]=(char)(97+i);
            }else{
                //增加大写字母
                chs[i]=(char)(65+i-26);
            }
        }

        Random r=new Random();

        String result="";
        for (int i = 0; i < 4; i++) {
            int rIndex=r.nextInt(chs.length);
            result=result+chs[rIndex];//字符串拼接
        }

        int rNum=r.nextInt(10);
        result=result+rNum;

        System.out.println("生成的随机数为："+result);


    }

}
