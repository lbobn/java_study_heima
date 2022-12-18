package com.lianxi.looptest;

import java.util.Random;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        //猜数字小游戏，10~20,5次保底
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int number = r.nextInt(20 - 10 + 1);//(生成的：0~10)
        int random_num = number + 10;//随机数10~20
        int count = 0;//保底计数

        while (true) {
            System.out.println("你要猜的数字");
            int guess_num = sc.nextInt();
            count++;
            if (count == 5) {
                System.out.println("猜中了");
                break;
            }
            if (guess_num > random_num) {
                System.out.println("说大了");
            } else if (guess_num < random_num) {
                System.out.println("说小了");
            } else {
                System.out.println("猜中了");
            }

        }
    }
}
