package com.oopTest.practice1;

import java.util.Random;

public class Role {
    private String name;
    private char gender;
    private int blood;
    private String face;

    String[] boy_expression = {
            "英俊潇洒",
            "面目狰狞",
            "五官端正",
            "相貌平平"
    };

    String[] girl_expression = {
            "沉鱼落雁",
            "亭亭玉立",
            "身材姣好",
            "相貌平平"
    };


    String[] hurt_skills = {
            "%s使用技能【降龙十八掌】攻击了%s",
            "%s使用技能【醉拳】攻击了%s",
            "%s使用技能【蛤蟆功】攻击了%s",
            "%s使用了技能【泰山压顶】攻击了%s"
    };

    String[] injured_kind = {
            "造成%s脸部受伤",
            "造成%s身受瘀伤",
            "造成%s内伤",
            "造成%s大出血"
    };

    public Role() {
    }

    public Role(String name, char gender, int blood) {
        this.name = name;
        this.gender = gender;
        this.blood = blood;
        this.setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        int index = r.nextInt(boy_expression.length);
        if (gender == '男') {
            this.face = boy_expression[index];
        } else if (gender == '女') {
            this.face = girl_expression[index];
        } else {
            this.face = "相貌平平";
        }

    }

    public void show() {
        System.out.println("姓名:" + this.name);
        System.out.println("性别:" + this.gender);
        System.out.println("血量:" + this.blood);
        System.out.println("面貌:" + this.face);
        System.out.println();
    }

    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(hurt_skills.length);
        String kungFu = hurt_skills[index];
        //role1攻击了role2
        System.out.printf(kungFu + ",", this.name, role.name);
        int damage = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - damage;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;//role2剩余血量
        role.setBlood(remainBlood);
        //role2受到伤害
        String injure = injured_kind[index];
        System.out.printf(injure + "\n", role.name);

    }


}
