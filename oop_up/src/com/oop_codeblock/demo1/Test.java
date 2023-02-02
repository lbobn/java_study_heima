package com.oop_codeblock.demo1;

public class Test {
    public static void main(String[] args) {
        //代码块内变量会在代码块结束后消失
        int b = 10;
        {
            int a = 8;
            System.out.println(a);
        }
        //此时变量a已消失


        //创建对象
        Student s = new Student();

    }

}
