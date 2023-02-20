package com.a05objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException {
        /*需求：
            将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
        */
        Student s1 = new Student("张三", 23, "南京");
        Student s2 = new Student("lisi", 24, "beijing");
        Student s3 = new Student("wangwu", 25, "西安");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("z08-io-code\\src\\com\\a05objectstream\\test8.txt"));
        oos.writeObject(list);

        oos.close();


    }
}
