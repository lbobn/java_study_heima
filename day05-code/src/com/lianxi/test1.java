package com.lianxi;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        //5.fori
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        switch(x+1){
            case 0-> System.out.println("nihao");
            case 1-> System.out.println("好的");
        }

        for (int i = 0; i < 5; i++) {
            if(i == 3-1){
                continue;
            }
            System.out.println("老虎在吃第"+(i+1)+"个包子");
        }
    }
}
