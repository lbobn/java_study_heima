package com.chatroom;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        System.out.println("服务器连接成功!");

        while (true) {
            int choice = menu();
            switch (choice) {
                case 1 -> {
                    while (login(socket)) {
                        System.out.println("欢迎进入聊天室");
                        //退出
                        //chat();
                    }
                }
                case 2 -> register(socket);

                default -> System.out.println("没有这个选项!");
            }

        }

    }

    private static boolean register(Socket socket) throws IOException {
        String user = checkInput();
        while (true) {

            OutputStream os = socket.getOutputStream();
            os.write(user.getBytes());
            InputStream is = socket.getInputStream();
            int b;
            String result = "";
            while ((b = is.read()) != -1) {
                result = result + (char) b;
            }
            if ("注册成功".equals(result)) {
                break;
            }
        }
        return true;
    }

    private static String checkInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username;
        String password;
        while (true) {
            //用户名: 长度:6~18位,  纯字母
            username = sc.nextLine();
            username = username.trim();
            if (username.matches("[a-zA-Z]{6,19}")) {
                break;
            }
            System.out.println("用户名格式有误,请重新输入:");
        }
        System.out.println("请输入密码:");
        while (true) {
            //密码: 长度3~8位,  首位字母开头,后面均为数字
            password = sc.nextLine();
            password = password.trim();
            if (password.matches("[a-zA-Z]//d{2,8}")) {
                break;
            }
            System.out.println("密码格式有误,请重新输入:");
        }
        //username=zhangsan&password=123
        return "username=" + username + "&" + "password=" + password;
    }

    private static boolean login(Socket socket) throws IOException {
        String user = checkInput();
        while (true) {

            OutputStream os = socket.getOutputStream();
            os.write(user.getBytes());
            InputStream is = socket.getInputStream();
            int b;
            String result = "";
            while ((b = is.read()) != -1) {
                result = result + (char) b;
            }
            if ("登录成功".equals(result)) {
                System.out.println(result);
                break;
            } else {
                System.out.println(result);
            }
        }
        return true;
    }

    public static int menu() {
        System.out.println("------------聊天室------------");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("请输入您的选择:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
