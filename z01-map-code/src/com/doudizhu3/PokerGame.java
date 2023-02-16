package com.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {

    //牌盒
    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String, Integer> hm = new HashMap<>();

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
        list.add(" 大王");
        list.add(" 小王");

        //指定牌的价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 16);
        hm.put("大王", 17);
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
        //排序
        sort(load);
        sort(player1);
        sort(player2);
        sort(player3);
        //看牌
        lookPoker("底牌", load);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    //利用价值排序
    private void sort(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    //获取牌的价值
    public int getValue(String poker) {
        String number = poker.substring(1);
        if (hm.containsKey(number)) {
            return hm.get(number);
        } else {
            return Integer.parseInt(number);
        }

    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + " : ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
