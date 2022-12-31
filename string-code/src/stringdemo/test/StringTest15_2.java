package stringdemo.test;

import java.util.Random;

public class StringTest15_2 {
    public static void main(String[] args) {
        //生成验证码
        /*内容：可以是小写，也可以是大写，还可以是数字
         * 规则：
         * 长度为5
         * 内容中有四位字母，一位数字
         * 数字只有一位，可出现为任意位置*/
        String captcha = getCaptcha();
        System.out.println("验证码为：");
        System.out.println(captcha);
    }

    public static String getCaptcha() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        char[] arr = new char[5];
        //生成字母
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            arr[i] = s.charAt(index);

        }
        //生成数字并打乱
        int randomNum = r.nextInt(10);
        arr[4] = (char) (randomNum + 48);

        int index = r.nextInt(4);
        char temp = arr[index];
        arr[index] = arr[4];
        arr[4] = temp;
        //返回结果
        return new String(arr);
    }
}
