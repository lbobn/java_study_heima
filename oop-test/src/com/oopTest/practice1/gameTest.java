package com.oopTest.practice1;

public class gameTest {
    public static void main(String[] args) {
        Role role1 = new Role("亚瑟", '男', 100);
        Role role2 = new Role("钟无艳", '女', 100);

        role1.show();
        role2.show();

        while (true) {
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.printf("%sKO了%s", role1.getName(), role2.getName());
                break;
            }

            role2.attack(role1);
            if (role1.getBlood() == 0) {
                System.out.printf("%sKO了%s", role2.getName(), role1.getName());
                break;
            }
        }


    }
}
