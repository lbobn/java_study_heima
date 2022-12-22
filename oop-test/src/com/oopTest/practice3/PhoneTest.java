package com.oopTest.practice3;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Phone[] arr = new Phone[3];

        //2.创建手机的对象
        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 4999, "蓝色");
        Phone p3 = new Phone("魅族", 3999, "红色");

        //3.把手机对象放到数组
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4.获取三部手机平均价格
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        //5.求平均价格
        double avg = sum / arr.length;
        System.out.println(avg);
    }


}
