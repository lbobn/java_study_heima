package com.oopTest.practice2;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods arr[] = new Goods[3];

        //2.创建对象
        Goods g1 = new Goods("001", "洗衣机", 1999.0, 20);
        //ctrl+p显示参数
        Goods g2 = new Goods("002", "电视机", 3099.0, 40);
        Goods g3 = new Goods("003", "洗衣机", 2059.0, 39);

        //3.存入数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getPrice() + " " + arr[i].getCount());
        }
    }
}
