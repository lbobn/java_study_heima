package com.oop_interface.demo1;

public class Test {
    public static void main(String[] args) {
        //接口的使用

        /*接口中成员的特点
        成员变量:
            只能是常量
            默认修饰符: public static final
        构造方法:
            没有
        成员方法:
            只能是抽象方法
            默认修饰符:public abstractJDK7以前:接口中只能定义抽象方法。
*/

        Frog f = new Frog("小青", 1);

        System.out.println(f.getName() + ", " + f.getAge());

        f.eat();
        f.swim();
    }
}
