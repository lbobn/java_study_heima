package com.oop_interface.adapter;

public class Test {
    public static void main(String[] args) {
        /*1. JDK7以前:接口中只能定义抽象方法。
        2. JDK8:接口中可以定义有方法体的方法。（默认、静态)
        3. JDK9:接口中可以定义私有方法。
        4．私有方法分为两种:普通的私有方法，静态的私有方法
        */

        /*适配器设计模式*/
        //适用只想重写某个方法

        /*1．当一个接口中抽象方法过多，但是我只要使用其中一部分的
        时候，就可以适配器设计模式
        2.书写步骤:
        编写中间类XXXAdapter实现对应的接口  对接口中的抽象方法进行空实现
        让真正的实现类继承中间类，并重写需要用的方法
        为了避免其他类创建适配器类的对象，中间的适配器类用abstract进行修饰
*/
        InterImpl ii = new InterImpl();
        ii.method5();


    }
}
