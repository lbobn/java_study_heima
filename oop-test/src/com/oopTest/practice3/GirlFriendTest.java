package com.oopTest.practice3;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组存入女朋友对象
        GirlFriend[] arr = new GirlFriend[4];

        //2.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("绫华", 18, "女", "下棋");
        GirlFriend gf2 = new GirlFriend("宵宫", 19, "女", "看烟花");
        GirlFriend gf3 = new GirlFriend("胡桃", 18, "女", "火葬doge");
        GirlFriend gf4 = new GirlFriend("甘雨", 500, "女", "工作");

        //3.把对象添加到数组
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();

        }

        //5.平均值
        int avg = sum / arr.length;

        //6.统计年龄比平均值小的，打印她们的信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + " " + gf.getAge() + " " + gf.getGender() + " " + gf.getHobby());

            }
        }
        System.out.println("共有" + count + "个");

    }
}
