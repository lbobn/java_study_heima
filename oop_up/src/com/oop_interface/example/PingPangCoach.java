package com.oop_interface.example;

public class PingPangCoach extends Coach implements English {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }


    @Override
    public void speakEnglish() {
        System.out.println("教练说英语");
    }
}
