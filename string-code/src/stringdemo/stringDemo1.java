package stringdemo;

public class stringDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("@" + s2 + "!");

        String s3 = new String("bcd");
        System.out.println(s3);

        char[] chs = {'d', 'e', 'f'};
        String s4 = new String(chs);
        System.out.println(s4);

        byte[] b = {97, 98, 99, 100};
        String s5 = new String(b);
        System.out.println(s5);
    }
}
