package com.test4;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString().replace("-", "");
        System.out.println(s);
    }
}
