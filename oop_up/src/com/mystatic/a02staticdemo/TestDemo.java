package com.mystatic.a02staticdemo;

public class TestDemo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printfArr(arr);
        System.out.println(str);

        double[] arr2 = {1.2, 1.3, 1.4, 1.5, 1.6};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);

    }
}
