package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {

        //public static <T> void sort(List<T> list)         //排序

        //public static <T> void sort(List<T> list，Comparator<T> c)     //根据指定的规则进行排序

        //public static <T> int binarySearch (List<T> list,T key)       //以二分查找法查找元素

        //public static <T> void copy(List<T> dest， List<T> src)        //拷贝集合中的元素

        //public static <T> int fill (List<T> list,T obj)               //使用指定的元素填充集合

        //public static <T> void max/ min(collection<T> coll)           //根据默认的自然排序获取最大/小值

        //public static <T> void swap(List<?> list， int i, int j)       //交换集合中指定位置的元素


        ArrayList<String> list = new ArrayList<>();
        //addAll()  批量添加
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg");
        System.out.println(list);

        //shuffle() 打乱集合
        Collections.shuffle(list);
        System.out.println(list);

        //排序
        Collections.sort(list);
        System.out.println(list);
        //指定规则排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);

        //以二分查找法查找元素
        int result = Collections.binarySearch(list, "ddd");
        System.out.println(result);

        //拷贝集合中的元素
        ArrayList<String> newList = new ArrayList<>();
        Collections.addAll(newList, "", "", "", "", "", "", "");
        //如果新集合长度小于旧集合会报错
        Collections.copy(newList, list);
        System.out.println(newList);

        //使用指定的元素填充集合
        Collections.fill(newList, "qqq");
        System.out.println(newList);

        //根据默认的自然排序获取最大/小值
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 4, 6, 1, 6, 8, 9, 12, 43, 6, 34);
        Integer max = Collections.max(list2);
        Integer min = Collections.min(list2);
        System.out.println("max=" + max + ", " + "min=" + min);

        //交换集合中指定位置的元素
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg");
        Collections.swap(list3, 0, 6);
        System.out.println(list3);
    }
}
