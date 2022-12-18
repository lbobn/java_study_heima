package com.itheima;

import javax.swing.*;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //电影院选座，1~100，奇数做左边，偶数坐右边

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入票号");
        int ticket = sc.nextInt();
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }
    }
}
