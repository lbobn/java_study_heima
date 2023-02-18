package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {
        /*
         *   需求：
         *       创建集合添加学生对象
         *       学生对象属性：name，age
         *   要求：
         *       把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
         *       使用方法引用完成
         * */
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("zhangsan", 23));
        list2.add(new Student("lisi", 24));
        list2.add(new Student("wangwu", 25));

        String[] arr = list2.stream().map(Student::toString).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));

        /*list2.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName()+"-"+student.getAge();
            }
        }).toArray(String[]::new);*/
    }
}
