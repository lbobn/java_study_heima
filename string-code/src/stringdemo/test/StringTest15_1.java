package stringdemo.test;

import java.util.Random;
import java.util.Scanner;

public class StringTest15_1 {
    public static void main(String[] args) {
        //键盘输入字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        //调用方法打乱
        String newStr = dislocate(str);
        System.out.println("打乱后为\n" + newStr);


    }

    //打乱内容
    public static String dislocate(String str) {
        Random r = new Random();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return new String(arr);
    }
}
