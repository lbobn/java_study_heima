package stringbuilddemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
