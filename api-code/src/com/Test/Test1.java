package com.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    /*
     * 键盘录入一些0~100的整数，并添加到集合中
     * 直到集合中数据和超过200结束*/

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个整数");
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            if (num < 1 || num > 100) {
                System.out.println("当前数字不在1~100之间，请重新输入");
                continue;
            }

            list.add(num);
            int sum = getSum(list);
            if (sum > 200) {
                System.out.println("集合中数据和已超200");
                break;
            }
        }


        System.out.println(list);
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;

    }
}
