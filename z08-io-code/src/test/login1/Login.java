package test.login1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\test\\login1\\userinfo.txt"));
        String line = br.readLine();
//        System.out.println(line);
        String[] u1 = line.split("&");
        String rightName = u1[0].split("=")[1];
        String rightPassword = u1[1].split("=")[1];
//        System.out.println(name);
//        System.out.println(password);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //比较
        if (rightName.equals(name) && rightPassword.equals(password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
