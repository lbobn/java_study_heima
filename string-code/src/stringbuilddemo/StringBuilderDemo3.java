package stringbuilddemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {

        /*判断回文数
         * reverse()应用*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        String num = sc.next();

        //使用stringbuilder处理反转
        StringBuilder sb = new StringBuilder(num);
        //反转
        sb.reverse();
        String result = sb.toString();
        if (result.equals(num)) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }

    }
}
