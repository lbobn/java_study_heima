package com.game.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面

    public LoginJFrame() {
        //设置界面宽高
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图单机版 登录界面");
        //界面置顶
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //让界面显示出来
        this.setVisible(true);
    }
}
