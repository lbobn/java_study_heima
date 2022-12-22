package stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc";

        //2."=="号比较
        //基本数据类型比较的是数据值
        //引用数据类型比较的是地址值
        System.out.println(s1 == s2);//false

        //3比较字符串内容是否相等
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //4.忽略大小写比较
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);

    }
}
