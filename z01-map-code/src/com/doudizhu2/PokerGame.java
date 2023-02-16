package com.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    //牌盒
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    //静态代码块
    //特点：随着类的加载而加载,而且只运行一次
    static {
        //准备牌
        //"♣" "♥" "♦" "♠"
        //"3" "4" "5" "6" "7" "8" "9" "10" "J" "Q" "K" "A" "2"
        String[] color = {"♣", "♥", "♦", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;

        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }


        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
    }


    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> load = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        //遍历牌盒拿到每张牌
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if (i <= 2) {
                load.add(serialNumber);
                continue;
            }

            switch (i % 3) {
                case 0 -> player1.add(serialNumber);
                case 1 -> player2.add(serialNumber);
                case 2 -> player3.add(serialNumber);
            }
        }
        //看牌
        lookPoker("底牌", load);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    public void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name + " : ");
        for (int serialNumber : list) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
