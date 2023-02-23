package com.reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        Class类中用于获取构造方法的方法
            Constructor<?>[] getConstructors()                                返回所有公共构造方法对象的数组
            Constructor<?>[] getDeclaredConstructors()                        返回所有构造方法对象的数组
            Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象


        Constructor类中用于创建对象的方法
            T newInstance(Object... initargs)                                 根据指定的构造方法创建对象
            setAccessible(boolean flag)                                       设置为true,表示取消访问检查
    */

        //1.获取class字节码文件对象
        Class<?> clazz = Class.forName("com.reflect2.Student");

        //2.获取构造方法
        /*Constructor<?>[] cons1 = clazz.getConstructors();
        for (Constructor<?> constructor : cons1) {
            System.out.println(constructor);
        }

        Constructor<?>[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : cons2) {
            System.out.println(constructor);
        }*/

        //获取空参构造
        /*Constructor<?> c1 = clazz.getConstructor();
        System.out.println(c1);*/

        /*Constructor<?> c2 = clazz.getConstructor(String.class);
        System.out.println(c2);*/

        Constructor<?> c3 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(c3);
        //获取修饰符
        /*int modifiers = c3.getModifiers();
        System.out.println(modifiers);*/
        //获取参数
        /*Parameter[] parameters = c3.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }*/

        //暴力反射：表示临时取消权限校验
        c3.setAccessible(true);
        //创建对象
        Student stu = (Student) c3.newInstance("张三", 23);
        System.out.println(stu);


    }
}
