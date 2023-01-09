package com.extendcode.a08extendsexercise;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("公司采购工作");
    }
}
