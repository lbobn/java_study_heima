package com.oop_interface.example;

public class PingPangPlayer extends Player implements English {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员讲英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓球");
    }
}
