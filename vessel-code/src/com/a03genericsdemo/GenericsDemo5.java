package com.a03genericsdemo;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        //泛型的通配符
        //泛型不具备继承性，数据有继承性
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        ArrayList<Student2> list4 = new ArrayList<>();
        method(list1);
        method(list2);
        method(list3);

        //method(list4);    ×
    }

    /*
     *此时，泛型里面写的是什么类型，那么只能传递什么类型的数据。
     * 弊端:
     *        利用泛型方法有一个小弊端，此时他可以接受任意的数据类型Ye Fu zi student
     *  希望:本方法虽然不确定类型，但是以后我希望只能传递Ye Fu zi
     *  此时我们就可以使用泛型的通配符:
     *       ?也表示不确定的类型
     *       他可以进行类型的限定
     *       ? extends E:表示可以传递E或者E所有的子类类型
     *       ?super E:表示可以传递E或者E所有的父类类型
     *
     * 应用：应用场景:
     *          1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口。
     *          2.如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以泛型的通配符
     *  泛型的通配符:
     *          关键点:可以限定类型的范围。
     **/
    public static void method(ArrayList<? extends Ye> list) {

    }
}


class Ye {

}

class Fu extends Ye {

}

class Zi extends Fu {

}

class Student2 {

}