package com.oop.demo.test3;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student("zhangsan", 23);
        String sName = s.getName();
        int sAge = s.getAge();
        System.out.println(sName);
        System.out.println(sAge);

    }

}
