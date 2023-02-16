package com.doudizhu.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {

    //属性
    private String name;

    private boolean up;

    private boolean canClick = false;

    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;
        if (this.up) {
            //显示正面
        } else {
            //显示反面
        }

        this.setSize(71, 96);

        this.addMouseListener(this);
    }


    //显示正面
    public void turnFront() {
        //设置正面
        this.setIcon(new ImageIcon("z02-farmerandload\\image\\poker\\" + name + ".png"));
        //修改变量
        this.up = true;
    }

    public void turnRear() {
        //设置反面
        this.setIcon(new ImageIcon("z02-farmerandload\\image\\poker\\rear.png"));
        //修改变量
        this.up = false;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //点击
        if (canClick) {
            int step = 0;
            if (clicked) {
                //当前牌已被点击
                //降落    y增加
                step = 20;
            } else {
                //当前牌未被点击
                //升起    y减少
                step = -20;
            }
            clicked = !clicked;

            Point from = this.getLocation();

            Point to = new Point(from.x, from.y + step);
            this.setLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     *
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     *
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     *
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     *
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     *
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
