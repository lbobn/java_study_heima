package com.oop_interface.example;

public class Test {
    public static void main(String[] args) {
        /*乒乓球运动员:姓名，年龄，学打乒乓球，说英语
          篮球运动员:姓名，年龄，学打篮球
          乒乓球教练:姓名，年龄，教打乒乓球，说英语
          篮球教练:姓名，年龄，教打篮球
        */

        PingPangPlayer ppp = new PingPangPlayer("张三", 23);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.study();
        ppp.speakEnglish();

        BasketballCoach bbc = new BasketballCoach("李四", 30);
        System.out.println(bbc.getName() + ", " + bbc.getAge());
        bbc.teach();

    }
}

