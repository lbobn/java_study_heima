package com.a01collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
         * add(E e)          增加
         * clear()           清空
         * remove(E e)       删除
         * contains(Object obj)          判断是否包含
         * isEmpty()         判断是否为空
         * size()            集合长度
         * */

        //Collection为接口，要创建他的实现类

        Collection<String> coll = new ArrayList<>();
        //1.添加元素,
        //List:返回true       Set:不重复返回true，否则返回false
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        System.out.println(coll);
        //2.清空元素
        //coll.clear();
        //System.out.println(coll);

        //3.删除(不能通过索引删除)
        coll.remove("ddd");
        System.out.println(coll);

        //4.判断元素是否包含(判断自定义类时，要重写equals()方法)
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);//true

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //6.集合长度
        int size = coll.size();
        System.out.println(size);
    }
}
