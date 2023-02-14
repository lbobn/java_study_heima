package com.a03genericsdemo;

public class GenericsDemo4 {
    public static void main(String[] args) {
        //泛型接口：
        //1.实现类给出具体类型
        //2.实现类延续泛型，创建实现类时再确定类型


        MyArrayList2 list1 = new MyArrayList2();//实现类为String
        list1.add("aaa");

        MyArrayList3<Integer> list2 = new MyArrayList3<>();
        list2.add(123);
    }
}
