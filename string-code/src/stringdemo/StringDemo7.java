package stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        /*定义一个方法，把 int数组中的数据按照指定的格式拼接成一个字符串返回,调用该方法，并在控制台输出结果。
        例如:
        数组为int[]arr = {1,2,3};
        执行方法后的输出结果为:[1，2,3]*/
        int[] arr = {1, 2, 3};

        String result = arrToString(arr);
        System.out.println(result);



        /*定义一个方法，实现字符串反转。
        键盘录入一个字符串，调用该方法后，在控制台输出结果例如，键盘录入abc，输出结果cba*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String result1 = reverse(str);
        System.out.println(result1);

    }

    public static String arrToString(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        if (arr == null) {
            return "";
        }

        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str + arr[i];
            } else {
                str = str + arr[i] + ", ";
            }
        }
        str = str + "]";
        return str;
    }


    public static String reverse(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            str += c;
        }
        return str;
    }

}
