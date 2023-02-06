package com.a01mathdemo;

public class Exercise2 {
    public static void main(String[] args) {
        //水仙花数
        水仙花数();
        四叶玫瑰数();
        五角星数();
    }

    private static void 水仙花数() {
        int count = 0;

        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("水仙花数的个数" + count);
    }

    private static void 四叶玫瑰数() {
        int count = 0;

        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("四叶玫瑰数的个数" + count);
    }

    private static void 五角星数() {
        int count = 0;

        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5);
            if (sum == i) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("五角星数的个数" + count);
    }
}
