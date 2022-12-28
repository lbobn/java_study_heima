package stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        /*stringjoiner()*/
        int[] arr = {1, 2, 3};

        StringJoiner sj = new StringJoiner("---");

        sj.add("add").add("cacm").add("000");
        System.out.println(sj);
    }
}
