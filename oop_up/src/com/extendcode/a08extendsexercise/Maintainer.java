package com.extendcode.a08extendsexercise;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("维护工作");
    }
}
