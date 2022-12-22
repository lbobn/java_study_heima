package stringdemo;

public class stringDemo1 {
    public static void main(String[] args) {
        /*获取字符串对象*/

        //1.直接赋值
        String s1 = "abc";
        System.out.println(s1);

        //2.new String()
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //3.new String("**")
        String s3 = new String("bcd");
        System.out.println(s3);

        //4.new String(char[] chs)
        char[] chs = {'d', 'e', 'f'};
        String s4 = new String(chs);
        System.out.println(s4);

        //5.new String(byte[] b)
        byte[] b = {97, 98, 99, 100};
        String s5 = new String(b);
        System.out.println(s5);
    }
}
