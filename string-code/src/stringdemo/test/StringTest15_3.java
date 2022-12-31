package stringdemo.test;

public class StringTest15_3 {
    public static void main(String[] args) {
        /*给定两个以字符串形式表示的非负整数num1和num2
         * 返回num1和num2的乘积，乘积也为字符串形式
         * 注意：使用已有知识点完成*/
        String num1 = "12355";
        String num2 = "35156";
        String resultNum = getProduct(num1, num2);
        System.out.println(resultNum);
    }

    //编写方法获取乘积
    public static String getProduct(String num1, String num2) {
        int number1 = getInt(num1);
        int number2 = getInt(num2);
        int number3 = number1 * number2;
        Integer n = number3;
        return n.toString();
    }

    //编写方法将字符串转为整数
    public static int getInt(String num) {
        char[] intNum = num.toCharArray();
        int result = 0;
        for (int i = 0; i < intNum.length; i++) {
            int temp = intNum[i] - 48;
            result = result * 10 + temp;
        }
        return result;
    }
}
