package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        //迭代器遍历


        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象(相当于指针，指向集合0索引)
        Iterator<String> it = coll.iterator();

        while (it.hasNext()) {//判断当前位置是否有元素

            //next()获取元素并移动指针
            String str = it.next();
            System.out.println(str);
            /*
             * 细节注意点:
             * 1，循环结束后再调用next()报错NoSuchElementException
             * 2，迭代器遍历完毕，指针不会复位(需重新获取迭代器对象)
             * 3，循环中只能用一次next方法(奇数个元素会报错)
             * 4，迭代器遍历时，不能用集合的方法进行增加或者删除(要用迭代器的remove())
             */

        }
    }
}
