package com.genericsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型时
        //可以添加任意类型数据,
        // 但都被当作Object类,此时便不能调用子类的特有功能

        ArrayList list = new ArrayList();

        list.add(123);
        list.add("aaa");
        list.add(new Student("zhangsan", 23));

        //遍历
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
