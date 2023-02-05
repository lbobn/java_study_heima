package com.game.ui;

import com.game.data.User;
import com.game.util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    //登录界面

    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("zhangsan", "12345"));
        list.add(new User("lisi", "67890"));
    }

    private final static String PRESS_LOGIN = "puzzlegame\\image\\login\\登录按下.png";
    private final static String LOGIN = "puzzlegame\\image\\login\\登录按钮.png";
    private final static String PRESS_REGISTER = "puzzlegame\\image\\login\\注册按下.png";
    private final static String REGISTER = "puzzlegame\\image\\login\\注册按钮.png";

    JLabel rightCode = new JLabel();
    JButton loginButton = null;
    JButton registerButton = null;

    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //设置界面图形
        initImagine();
    }

    private void initImagine() {
        //清空原来有的图片
        this.getContentPane().removeAll();

        //1.用户名
        JLabel usernameTitle = new JLabel(new ImageIcon("puzzlegame\\image\\login\\用户名.png"));
        usernameTitle.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameTitle);
        //输入框
        JTextField usernameInput = new JTextField();
        usernameInput.setBounds(195, 134, 200, 30);
        this.getContentPane().add(usernameInput);


        //2.密码
        JLabel passwordTitle = new JLabel(new ImageIcon("puzzlegame\\image\\login\\密码.png"));
        passwordTitle.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordTitle);
        //输入框
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(195, 194, 200, 30);
        this.getContentPane().add(passwordInput);

        //3.验证码
        JLabel captchaTitle = new JLabel(new ImageIcon("puzzlegame\\image\\login\\验证码.png"));
        captchaTitle.setBounds(116, 256, 50, 30);
        this.getContentPane().add(captchaTitle);
        //输入框
        JTextField captchaInput = new JTextField();
        captchaInput.setBounds(195, 256, 100, 30);
        this.getContentPane().add(captchaInput);
        //验证码显示
        String codeStr = CodeUtil.getCode();

        rightCode.setText(codeStr);
        rightCode.setBounds(300, 256, 50, 30);
        rightCode.addMouseListener(this);
        this.getContentPane().add(rightCode);


        //4.按钮
        //登录
        loginButton = new JButton(new ImageIcon(LOGIN));
        loginButton.setBounds(110, 310, 128, 47);
        //去除按钮边框
        loginButton.setBorderPainted(false);
        //去除按钮背景
        loginButton.setContentAreaFilled(false);
        loginButton.addMouseListener(this);
        this.getContentPane().add(loginButton);
        //注册
        registerButton = new JButton(new ImageIcon(REGISTER));
        registerButton.setBounds(250, 310, 128, 47);
        //去除按钮边框
        registerButton.setBorderPainted(false);
        //去除按钮背景
        registerButton.setContentAreaFilled(false);
        registerButton.addMouseListener(this);
        this.getContentPane().add(registerButton);


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

        //给整个界面添加界面监听事件
        this.addMouseListener(this);
    }

    //弹框
    public void showJDialog(String content) {
        //创建弹框对象
        JDialog jDialog = new JDialog();
        jDialog.setSize(200, 150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        //添加文字
        JLabel jLabel = new JLabel(content);
        jLabel.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(jLabel);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object button = e.getSource();
        if (button == loginButton) {
            System.out.println("登录松开");
            loginButton.setIcon(new ImageIcon(LOGIN));


        } else if (button == registerButton) {
            System.out.println("注册松开");
            registerButton.setIcon(new ImageIcon(REGISTER));


        } else if (button == rightCode) {
            System.out.println("切换验证码");
            String codeStr = CodeUtil.getCode();
            rightCode.setText(codeStr);

        }
    }

    //鼠标按住不松
    @Override
    public void mousePressed(MouseEvent e) {
        Object button = e.getSource();
        if (button == loginButton) {
            System.out.println("登录按下");
            loginButton.setIcon(new ImageIcon(PRESS_LOGIN));

        } else if (button == registerButton) {
            System.out.println("注册按下");
            registerButton.setIcon(new ImageIcon(PRESS_REGISTER));

        }

    }


    //鼠标按下松开
    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
