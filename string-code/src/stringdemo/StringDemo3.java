package stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.键盘录入abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        //2.自己定义一个字符串
        String str2 = "abc";
        //3.用“==”比较
        System.out.println(str1 == str2);
        //4.内容比较
        System.out.println(str1.equals(str2));
    }
}
