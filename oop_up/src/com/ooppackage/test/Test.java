package com.ooppackage.test;

import com.ooppackage.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        /*使用同一个包中的类时，不需要导包。
        使用java.lang包中的类时，不需要导包。
        其他情况都需要导包
        如果同时使用两个包中的同名类，需要用全类名。
        */
        Teacher t = new Teacher();
        com.ooppackage.domain2.Teacher t2 = new com.ooppackage.domain2.Teacher();
    }
}
