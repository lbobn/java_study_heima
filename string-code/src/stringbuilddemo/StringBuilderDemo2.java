package stringbuilddemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");


        //字符串反转
        StringBuilder reverse = sb.reverse();
        String result = reverse.toString();
        System.out.println(result);

        //添加字符串
        sb.append("efg");
        System.out.println(sb);

        //字符串长度
        int len = sb.length();
        System.out.println(len);
    }
}
