package com.a01collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class A06_CollectionDemo6 {
    public static void main(String[] args) {
        //增强for遍历   (所有单列集合和数组)
        //格式    for(数据类型 变量名:集合/数组){ }
        //集合名.for

        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
