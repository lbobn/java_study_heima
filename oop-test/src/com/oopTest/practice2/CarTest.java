package com.oopTest.practice2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1.创建数组存三个汽车对象
        Car arr[] = new Car[3];

        //2.创建汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车价格");
            double price = sc.nextDouble();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            c.setColor(color);

            //将汽车对象存入数组
            arr[i] = c;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand() + " " + arr[i].getPrice() + " " + arr[i].getColor());
        }

    }
}
