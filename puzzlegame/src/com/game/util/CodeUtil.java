package com.game.util;

import java.util.Random;

public class CodeUtil {

    public static String getCode() {
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
