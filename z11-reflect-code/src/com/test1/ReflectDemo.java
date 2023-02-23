package com.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        /*
        对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
    */
        Student s = new Student("张三", 23, '男', 160.0, "睡觉");
        Teacher t = new Teacher("李老师", 10000);
        saveObject(t);
    }

    //把对象里面所有的成员变量名和值保存到本地文件中
    public static void saveObject(Object o) throws IOException, IllegalAccessException {
        //1.获取字节码文件的对象
        Class<?> clazz = o.getClass();
        //2. 创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("z11-reflect-code\\src\\com\\test1\\a.txt"));
        //3. 获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //暴力反射
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(o);
            //写出数据
            bw.write(name + "=" + value);
            bw.newLine();
        }
        bw.close();
    }
}
