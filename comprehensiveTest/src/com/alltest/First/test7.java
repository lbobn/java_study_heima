package com.alltest.First;

public class test7 {
    public static void main(String[] args) {
        /*一季度：22,66,44
         * 二季度：77,33，88
         * 三季度：25,45,65
         * 四季度：11，66,99
         * 计算出每个季度营业额和全年营业额*/

        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int yearSum=0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int sum=getSum(yearArrArr[i]);
            System.out.println("第"+(i+1)+"季度的总营业额为"+sum);
            yearSum=yearSum+sum;
        }
        System.out.println("全年总营业额为"+yearSum);
        
    }
    
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
