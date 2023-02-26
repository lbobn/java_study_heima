package com.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException,
            InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
    */


        //1.读取配置文件中的信息
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("z11-reflect-code\\prop.properties");
        prop.load(fis);
        fis.close();
        /*System.out.println(prop);*/

        //2.获取全类名和方法名
        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");

        System.out.println(classname);
        System.out.println(method);

        //3.利用反射创建对象并运行方法
        Class<?> clazz = Class.forName(classname);

        //获取构造方法
        Constructor<?> con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        //获取成员方法并运行
        Method method1 = clazz.getDeclaredMethod(method);
        method1.setAccessible(true);
        method1.invoke(o);
    }
}
