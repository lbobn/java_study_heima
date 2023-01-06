package com.mystatic.a03staticdemo;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {

    }

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        //1.定义一个参照物
        int max = list.get(0).getAge();
        //2.循环遍历
        for (int i = 0; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if (age > max) {
                max = age;
            }
        }

        return max;
    }
}
