package com.Test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*定义数组存储女朋友对象,利用Arrays中的sort方法排序
         * 要求:
         * 按年龄大小排序,若年龄一样,按身高,身高一样按姓名*/

        //1.创建对象
        Girlfriend gf1 = new Girlfriend("zhangsan", 18, 1.67);
        Girlfriend gf2 = new Girlfriend("lisi", 19, 1.72);
        Girlfriend gf3 = new Girlfriend("wangwu", 19, 1.78);


        //2.定义数组
        Girlfriend[] arr = {gf1, gf2, gf3};

        //3.利用Arrays中的sort方法排序
        Arrays.sort(arr,
                (o1, o2) -> {
                    double temp = o1.getAge() - o2.getAge();

                    temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;

                    temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                    if (temp > 0) {
                        return 1;
                    } else if (temp < 0) {
                        return -1;
                    } else return 0;
                }
        );

        //输出
        System.out.println(Arrays.toString(arr));
    }
}
