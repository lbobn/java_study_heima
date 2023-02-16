package com.doudizhu.game;

import com.doudizhu.domain.Poker;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Common {


    //移动牌（有移动的动画效果）
    public static void move(Poker poker, Point from, Point to) {
        if (to.x != from.x) {
            double k = (1.0) * (to.y - from.y) / (to.x - from.x);
            double b = to.y - to.x * k;
            int flag = 0;
            if (from.x < to.x)
                flag = 20;
            else {
                flag = -20;
            }
            for (int i = from.x; Math.abs(i - to.x) > 20; i += flag) {
                double y = k * i + b;

                poker.setLocation(i, (int) y);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        poker.setLocation(to);
    }


    //利用牌的价值，将集合中的牌进行排序
    public static void order(ArrayList<Poker> list) {
        //此时可以改为lambda表达式
        Collections.sort(list, new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                //获取花色
                //1-黑桃 2-红桃 3-梅花 4-方块 5-大小王
                int a1 = Integer.parseInt(o1.getName().substring(0, 1));
                int a2 = Integer.parseInt(o2.getName().substring(0, 1));

                //获取牌上的数字,同时也是牌的价值
                //1-A ... 11-J 12-Q 13-K
                int b1 = Integer.parseInt(o1.getName().substring(2));
                int b2 = Integer.parseInt(o2.getName().substring(2));

                //计算牌的价值，利用牌的价值进行排序
                //牌上的数字在3~10之间，价值就是3~10
                //3:价值3
                //...
                //10:价值10
                //J:价值11
                //Q:价值12
                //K:价值13
                //A：1 + 20 = 21
                //2：2 + 30 = 32
                //小王：1 + 100 = 101
                //大王：2 + 100 = 102

                //计算大小王牌的价值
                if (a1 == 5) {
                    b1 += 100;
                }
                if (a2 == 5) {
                    b2 += 100;
                }

                //计算A的价值
                if (b1 == 1) {
                    b1 += 20;
                }
                if (b2 == 1) {
                    b2 += 20;
                }
                //计算2的价值
                if (b1 == 2) {
                    b1 += 30;
                }
                if (b2 == 2) {
                    b2 += 30;
                }

                //倒序排列
                int flag = b2 - b1;

                //如果牌的价值一样，则按照花色排序
                if (flag == 0) {
                    return a2 - a1;
                } else {
                    return flag;
                }
            }
        });
    }

    //重新摆放牌
    public static void rePosition(GameJFrame m, ArrayList<Poker> list, int flag) {
        Point p = new Point();
        if (flag == 0) {
            p.x = 50;
            p.y = (450 / 2) - (list.size() + 1) * 15 / 2;
        }
        if (flag == 1) {
            p.x = (800 / 2) - (list.size() + 1) * 21 / 2;
            p.y = 450;
        }
        if (flag == 2) {
            p.x = 700;
            p.y = (450 / 2) - (list.size() + 1) * 15 / 2;
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            Poker poker = list.get(i);
            Common.move(poker, poker.getLocation(), p);
            m.container.setComponentZOrder(poker, 0);
            if (flag == 1)
                p.x += 21;
            else
                p.y += 15;
        }
    }


}

