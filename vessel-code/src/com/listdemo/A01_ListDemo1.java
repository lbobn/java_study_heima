package com.listdemo;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        /*List系列集合独有的方法:
            void add(int index,E element)       在此集合中的指定位置插入指定的元素
            Eremove(int index)                   删除指定索引处的元素，返回被删除的元素
            E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
            E get(int index)                返回指定索引处的元素
 String */

        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //void add(int index,E element)     在集合中的指定位置插入元素,原来元素后移
        list.add(0, "qqq");
        System.out.println(list);

        //remove()
        //对于Integer类型,若需删除指定元素,需要先装箱
        String remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);

        //set()
        String result = list.set(0, "qqq");
        System.out.println(result);
        System.out.println(list);

        //get()
        String s = list.get(2);
        System.out.println(s);
        System.out.println(list);


    }
}
