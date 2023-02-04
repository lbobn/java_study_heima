package com.game.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面宽高
        jFrame.setSize(603, 680);
        //设置界面标题
        jFrame.setTitle("演示");
        //界面置顶
        jFrame.setAlwaysOnTop(true);
        //界面居中
        jFrame.setLocationRelativeTo(null);
        //取消默认的居中放置
        jFrame.setLayout(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);


        //创建一个按钮对象
        JButton jButton = new JButton("点我啊");
        //设置位置和宽高
        jButton.setBounds(0, 0, 100, 50);
        //给按钮添加动作监听(鼠标左键单击或空格)
        jButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("达咩~不要点我哟");
                    }
                }


        );//按下按钮后执行括号内代码

        //把按钮添加到界面
        jFrame.getContentPane().add(jButton);


        //让界面显示出来
        jFrame.setVisible(true);
    }
}
