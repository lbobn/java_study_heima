package stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int BigCount = 0;
        int SmallCount = 0;
        int NumberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                SmallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                BigCount++;
            } else if (c >= '0' && c <= '9') {
                NumberCount++;
            }
        }
        System.out.println("大写字母有" + BigCount + "个");
        System.out.println("小写字母有" + SmallCount + "个");
        System.out.println("数字有" + NumberCount + "个");

    }
}
