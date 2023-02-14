package com.a03genericsdemo.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);

    }


    /*测试类中定义一个方法用于饲养动物
        public static void keepPet(ArrayList<? ??> list){
        //遍历集合，调用动物的eat方法
        }
        要求1:该方法能养所有品种的猫，但是不能养狗
        要求2:该方法能养所有品种的狗，但是不能养猫
        要求3:该方法能养所有的动物，但是不能传递其他类型
*/

    //要求1:该方法能养所有品种的猫，但是不能养狗
/*    public static void keepPet(ArrayList<? extends Cat> list){
        //遍历集合，调用动物的eat方法

    }*/

    //要求2:该方法能养所有品种的狗，但是不能养猫
/*    public static void keepPet(ArrayList<? extends Dog> list){
        //遍历集合，调用动物的eat方法

    }*/

    //要求3:该方法能养所有的动物，但是不能传递其他类型
    public static void keepPet(ArrayList<? extends Animal> list) {
        //遍历集合，调用动物的eat方法

    }
}
