package test.login2;

import java.io.*;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\test\\login2\\userinfo.txt"));
        String line = br.readLine();
        String[] u1 = line.split("&");
        String rightName = u1[0].split("=")[1];
        String rightPassword = u1[1].split("=")[1];
        int count = Integer.parseInt(u1[2].split("=")[1]);
        br.close();


        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String name = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //比较
        if (rightName.equals(name) && rightPassword.equals(password) && count < 3) {
            System.out.println("登录成功");
            writeInfo("username=" + rightName + "&password=" + rightPassword + "&count=0");

        } else {
            if (count < 3) {
                count++;
                System.out.println("登录失败" + "您还有" + (3 - count) + "次机会");
            } else {
                System.out.println("账户已被锁定");
            }
            writeInfo("username=" + rightName + "&password=" + rightPassword + "&count=" + count);
        }
    }

    public static void writeInfo(String info) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("z08-io-code\\src\\test\\login2\\userinfo.txt"));
        bw.write(info);
        bw.close();
    }
}
