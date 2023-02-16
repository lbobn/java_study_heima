package com.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    //静态代码块
    //特点：随着类的加载而加载,而且只运行一次
    static {
        //准备牌
        //"♣" "♥" "♦" "♠"
        //"3" "4" "5" "6" "7" "8" "9" "10" "J" "Q" "K" "A" "2"
        String[] color = {"♣", "♥", "♦", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("大王");
        list.add("小王");
    }


    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> load = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //遍历牌盒拿到每张牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                load.add(poker);
                continue;
            }

            switch (i % 3) {
                case 0 -> player1.add(poker);
                case 1 -> player2.add(poker);
                case 2 -> player3.add(poker);
            }
        }
        //看牌
        lookPoker("底牌", load);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + " : ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
