package stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        /*金额转换（7位）*/
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if (money > 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额超出范围，请重新输入");
            }
        }


        //取出每一位数并得到大写
        String moneyStr = "";
        while (true) {
            int ge = money % 10;
            money /= 10;
            char capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            if (money == 0) {
                break;
            }
        }

        //前面补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            result = result + moneyStr.charAt(i) + arr[i];
        }

        System.out.println(result);

    }

    public static char getCapitalNumber(int n) {
        char[] capitalNumber = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        return capitalNumber[n];
    }
}
