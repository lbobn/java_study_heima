package stringdemo.test;

import java.util.Scanner;

public class StringTest15_4 {
    public static void main(String[] args) {
        /*给你一个字符串s，由若干单词组成，单词前后用空格隔开
         * 返回字符串最后一个单词的长度
         * 单词是指仅由字母组成、不包含任何空格字符的最大子字符串*/

        /*实例1：输入：s="Hello world"   输出：5*/
        /*实例2：输入：s="fly me to th moon"   输出：4*/
        /*实例3：输入：s="luffy is still joyboy"   输出：4*/

        //倒着遍历，直到遇到空格为止
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        int count = getEndWordLen(str);
        System.out.println("最后一个单词长度为" + count);
    }

    public static int getEndWordLen(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char t = str.charAt(i);
            if (t >= 'a' && t <= 'z') {
                count++;
            } else if (t >= 'A' && t <= 'Z') {
                count++;
            } else if (t == ' ') {
                break;
            }
        }

        return count;
    }
}
