package com.a03genericsdemo;

import java.util.Arrays;

/*
 * 编写类时,不确定类型,则可定义为"泛型类"*/
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    /*E:不确定的类型,e:形参名*/
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
