package com.it.studentsystemPlus;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择：1.登录 2.注册 3.忘记密码");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }


    }

    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {

    }

    //注册
    private static void register(ArrayList<User> list) {
        //注册

        Scanner sc = new Scanner(System.in);


        /*数据输入及校验*/
        //录入用户名
        String username;
        while (true) {
            //1.键盘录入用户名
            System.out.println("请输入用户名");
            username = sc.next();
            //先验证格式,再验证唯一性
            // 用户名唯一
            boolean flag1 = checkUsername(username);

            if (!flag1) {
                System.out.println("用户名格式不满足要求,需重新输入");
                continue;
            }
            //校验唯一性
            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("用户名" + username + "已存在,请重新输入");
            } else {
                //不存在则退出用户名校验,即用户名可使用,继续后续操作
                break;
            }
        }

        //录入密码
        String password;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("密码不一致,请重新输入");
                continue;
            } else {
                //密码一致,继续后续操作
                break;
            }
        }

        //录入身份证
        String ID;
        while (true) {
            System.out.println("请输入身份证号");
            ID = sc.next();
            boolean flag = checkID(ID);
            if (flag) {
                //身份证格式正确，继续后续操作
                break;
            } else {
                System.out.println("身份证格式有误，请重新输入");
            }
        }

        //录入手机号
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (!flag) {
                System.out.println("手机号格式有误，请重新输入");
            } else {
                //格式正确，注册的信息输入完毕
                break;
            }
        }

        /**/
        //用户名,密码,身份证,手机号放入用户对象中
        //把用户对象放入集合
        User u = new User(username, password, ID, phoneNumber);
        list.add(u);
        System.out.println("注册成功");

        printfList(list);

    }

    //输出用户信息集合
    private static void printfList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getUsername() + ", " + u.getPassword() + ", " + u.getPersonID() + ", " + u.getPhoneNumber());
        }
    }

    //检查电话号格式
    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        //必须均为数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //格式正确，返回true
        return true;
    }

    //检查身份证号格式
    private static boolean checkID(String id) {
        //长度18位，
        if (id.length() != 18) {
            return false;
        }
        //不能以0开头
        boolean flag = id.startsWith("0");
        if (flag) {
            //如果以0开头，返回false
            return false;
        }
        //前17位为数字
        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        //最后一位为数字或"X"或"x"
        char endChar = id.charAt(id.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    //查找用户名是否存在
    private static boolean contains(ArrayList<User> list, String username) {

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String username1 = user.getUsername();
            if (username1.equals(username)) {
                return true;
            }
        }
        return false;
    }

    //检查用户名格式
    private static boolean checkUsername(String username) {
        // 用户名长度必须在3~15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        // 只能是字母加数字的组合，但是不能是纯数字
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        //满足以上字母+数字要求后进一步判断
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    //登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            //判断用户名是否存在
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "不存在，请先注册");
                return;
            }

            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确验证码为" + rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    //System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入");
                    continue;
                }
            }
            //验证用户名及密码正确性
            //传递参数可以传递整体(封装思想利用)
            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败，用户名或密码错误！");
                if (i == 2) {
                    System.out.println("当前账号已被锁定，请联系管理员10086");
                } else {
                    System.out.println("还剩" + (2 - i) + "次机会");
                }
            }
        }


    }

    //登录信息验证
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        //循环结束还未找到相同信息，则返回false
        return false;
    }

    //生成验证码
    public static String getCode() {
        //1.创建集合添加所有大写小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //随机抽取4个字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        //生成随机数
        int number = r.nextInt(10);
        sb.append(number);
        //将随机数与随机索引的字符交换位置
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        //交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }
}
