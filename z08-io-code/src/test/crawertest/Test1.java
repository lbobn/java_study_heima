package test.crawertest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {

        /*
        制造假数据:
        获取姓氏: https: / / hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0获取男生名字:http:// www.haoming8.cn/baobao/10881.html
        获取女生名字: http : / /www. haoming8.cn/baobao/7641.html
        */


        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //System.out.println(familyNameStr);

        ArrayList<String> familyNameTempStr = getData(familyNameStr, "(.{4})(。|，)", 1);
        ArrayList<String> boyNameTempStr = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(。|、)", 1);
        ArrayList<String> girlNameTempStr = getData(girlNameStr, "(.. ){4}..", 0);
        System.out.println(girlNameTempStr);
        //ArrayList<String> girlNameTempStr = getData(girlNameStr, "(.{4})(。|，)", 1);
        //System.out.println(familyNameTempStr);

    }

    /*
    作用:根据正则表达式获取字符串中的数据
     */
    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            list.add(group);
        }
        return list;
    }


    /*
     *作用:
     *从网络中爬取数据，把数据拼接成字符串返回
     */
    public static String webCrawler(String net) throws IOException {
        //定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //创建URL对象
        URL url = new URL(net);
        //连接上这个网址
        URLConnection conn = url.openConnection();
        //读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int b;
        while ((b = isr.read()) != -1) {
            sb.append((char) b);
        }
        isr.close();
        return sb.toString();
    }
}
