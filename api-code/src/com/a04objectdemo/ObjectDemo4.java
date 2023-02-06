package com.a04objectdemo;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {

        //clone()     对象克隆
        //1.需重写方法
        //2.让javabean类实现Cloneable接口
        //3.创建原对象调用clone()

        //浅克隆：只将地址拷贝
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};

        User u1 = new User(19, "zhangsan", "1234qwert", "girl11", data);

        Object u2 = u1.clone();

        System.out.println(u1);
        System.out.println(u2);
    }
}
