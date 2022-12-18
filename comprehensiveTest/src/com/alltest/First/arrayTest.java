package com.alltest.First;

public class arrayTest {
    public static void main(String[] args) {

        //静态初始化
        int[][] arr0=new int[][]{{1,2,3},{4,5,6,7,8}};
        int[][] arr1={{1,2,3},{4,5,6,7,8}};//简写
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        //动态初始化
        int[][] arr2=new int[3][5];
        arr2[0][0]=10;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
