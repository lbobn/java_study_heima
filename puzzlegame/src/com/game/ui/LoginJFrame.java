package com.game.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面


    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //设置界面图形
        initImagine();
    }

    private void initImagine() {
        /*//清空原来有的图片
        this.getContentPane().removeAll();*/


        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        //把背景图片添加到界面
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图单机版 登录界面");
        //界面置顶
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //取消默认的居中放置
        this.setLayout(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //让界面显示出来
        this.setVisible(true);

        /*//给整个界面添加界面监听事件
        this.addKeyListener(this);*/
    }
}
