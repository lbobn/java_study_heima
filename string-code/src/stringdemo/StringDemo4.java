package stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        /*需求:已知正确的用户名和密码，请用程序实现模拟用户登录。
         * 总共给三次机会，登录之后，给出相应的提示*/

        String username = "zhangsan";
        String password = "123456";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username1 = sc.next();
            System.out.println("请输入密码");
            String password1 = sc.next();
            if (username.equals(username1) && password.equals(password1)) {
                System.out.println("登录成功！");
                break;
            } else {
                if ((2 - i) != 0) {
                    System.out.println("登录失败，用户名或密码错误，您还有" + (2 - i) + "次机会");
                } else {
                    System.out.println("三次机会已用完,账户已锁定，请联系管理员XXX-XXXX");
                }

            }
        }

    }
}
