package stringdemo;

public class StringDemo9 {
    public static void main(String[] args) {
        /*substring()的使用*/
        String phoneNumber = "1112345999";

        /*获取手机号前三位
         * substring()包头不包尾*/
        String start = phoneNumber.substring(0, 3);

        //截取后四位
        String end = phoneNumber.substring(7);

        //拼接
        String result = start + "****" + end;
        System.out.println(result);

        /*读取身份证信息*/
        String id = "615151202212284726";
        //获取出生年月
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        System.out.println("人物信息为");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");

        //获取性别
        char gender = id.charAt(16);
        if ((gender - 48) % 2 == 0) {
            System.out.println("性别：女");
        } else {
            System.out.println("性别：男");
        }


    }
}
