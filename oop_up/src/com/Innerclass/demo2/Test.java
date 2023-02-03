package com.Innerclass.demo2;

public class Test {
    public static void main(String[] args) {

        /*写在成员位置的，属于外部类的成员。
        成员内部类可以被一些修饰符所修饰，
        比如: private，默认，protected,public， static等
        在成员内部类里面，JDK16之前不能定义静态变量，JDK 16开始才可以定义静态变量。
*/

        //获取成员内部类的对象
        /*在外部类中编写方法，对外提供内部类的对象。
            直接创建格式:外部类名.内部类名对象名=外部类对象.内部类对象;
*/

        //创建内部类的对象
        Outer.Inner oi = new Outer().new Inner();

        System.out.println(oi);

        oi.show();
        Outer o = new Outer();


    }
}
