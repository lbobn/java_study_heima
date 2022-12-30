package stringdemo.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest13 {
    public static void main(String[] args) {
      /*  键盘录入一个字符串，要求1∶长度为小于等于9
                            要求2:只能是数字
                        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系:
        I -1、II-2、III- 3、IV - 4、V -5、VI-6、VII- 7、VIII-8、IX - 9
        注意点:
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)
        //char c=switch(x){
*/
/*
        int x=0;
         String s=switch(x){
            case 1->"I";
            case 2->"II";
            case 3->"III";
            case 4->"IV";
            case 5->"V";
            case 6->"VI";
            case 7->"VII";
            case 8->"VIII";
            case 9->"IX";

        };*/
        String str;
        while (true) {
            //键盘录入字符串
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入字符串：");
            str = sc.next();
            //字符串校验
            if (!checkStr(str)) {
                System.out.println("字符串不符合要求，请重新输入：");
            } else {
                break;
            }
        }

        String[] RomeStr = toRomeNum(str);
        for (int i = 0; i < RomeStr.length; i++) {
            if (RomeStr[i] != null) {
                if (i == RomeStr.length - 1 || RomeStr[i + 1] == null) {
                    System.out.print(RomeStr[i]);
                } else {
                    System.out.print(RomeStr[i] + ", ");
                }
            }

        }

    }

    public static String[] toRomeNum(String str) {
        String[] RomeNumber = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] newStr = new String[9];
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 48;
            newStr[i] = RomeNumber[index];
            flag++;
        }
        return newStr;
    }

    public static boolean checkStr(String str) {
        //长度小于等于9
        if (str.length() > 9) {
            return false;
        }
        //必须只能为数字
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
