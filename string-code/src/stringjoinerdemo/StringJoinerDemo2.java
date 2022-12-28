package stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        String[] str = {"1", "2", "3"};

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < str.length; i++) {
            sj.add(str[i]);
        }

        String result = sj.toString();
        System.out.println(result);
    }
}
