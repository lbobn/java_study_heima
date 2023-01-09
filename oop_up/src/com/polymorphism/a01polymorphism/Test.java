package com.polymorphism.a01polymorphism;

public class Test {
    public static void main(String[] args) {

        //多态:对象的多种形态
        //前提:有继承/实现关系
        //      有父类引用指向子类对象
        //      有方法重写
        //好处:
        //方法使用父类型作为参数,可以接受所有子类对象
        //体现多态便利性与扩展性

        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(20);

        Teacher t = new Teacher();
        t.setName("wangjianguo");
        t.setAge(31);

        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(30);

        register(s);
        register(t);
        register(admin);

    }

    //方法能接受老师,学生,管理员
    //只能把参数写为他三个的父类
    public static void register(Person p) {
        p.show();
    }
}
