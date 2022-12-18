package com.alltest.First;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
//        评委打分
//        共六个评委，评分范围是[0-100]
//        选手最后得分为：去掉一个最高分和一个最低分的平均值

        //shift+F6批量修改
        //定义数组存储分数
        int[] scoreArr = getScore();
        //求数组最大值
        int maxScore = getMax(scoreArr);
        //求数组最小值
        int minScore = getMin(scoreArr);
        //求所有分数和
        int sumScore = getSum(scoreArr);
        //求出最终成绩并输出
        int finalScore = (sumScore - maxScore - minScore) / (scoreArr.length - 2);
        System.out.println("最终成绩为：" + finalScore);


    }

    //定义数组存评分
    public static int[] getScore() {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i + 1) + "个评委的评分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {             //判断数值合法性
                scores[i] = score;
                i++;
            } else {
                System.out.println("评分超出范围，请重新输入!");
            }
        }
        return scores;
    }

    //求数组最大值
    public static int getMax(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    //求数组最小值
    public static int getMin(int[] arr) {
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }

    //求和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
