package stringdemo.test;

public class StringTest14_1 {
    public static void main(String[] args) {

        /*给定两个字符串，A和B。
        A的旋转操作就是将A最左边的字符移动到最右边。
        例如，若A = 'abcde '，在移动一次之后结果就是' bcdea '如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false
        */
        String strA = "abcde";
        String strB = "cdeab";

        //旋转字符串
       /* String rotate=rotate(strA);
        System.out.println(rotate);*/
        //判断
        boolean result = check(strA, strB);
        if (result) {
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配失败");
        }


    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    //把左边的字符移动到右侧
    public static String rotate(String str) {
        //1.subString截取
        //2.变成字符数组再操作
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }
}
