package com.genericsdemo;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        String s = list.get(2);
        System.out.println(s);

        System.out.println(list);

    }
}
