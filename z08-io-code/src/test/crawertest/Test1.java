package test.crawertest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
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
        //爬取数据
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //根据正则表达式获取想要的内容
        ArrayList<String> familyNameTempStr = getData(familyNameStr, "(.{4})(。|，)", 1);
        ArrayList<String> boyNameTempStr = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(。|、)", 1);
        ArrayList<String> girlNameTempStr = getData(girlNameStr, "(.. ){4}..", 0);

        //处理数据
        //姓处理
        ArrayList<String> familyName = new ArrayList<>();
        for (String s : familyNameTempStr) {
            for (int i = 0; i < s.length(); i++) {
                familyName.add(s.charAt(i) + "");
            }
        }
        //男生名字处理
        ArrayList<String> boyName = new ArrayList<>();
        for (String s : boyNameTempStr) {
            if (!boyName.contains(s)) {
                boyName.add(s);
            }
        }
        //女生名字处理
        ArrayList<String> girlName = new ArrayList<>();
        for (String s : girlNameTempStr) {
            String[] arr = s.split(" ");
            for (String s1 : arr) {
                girlName.add(s1);
            }
        }
        //获取数据
        ArrayList<String> info = getInfo(familyName, boyName, girlName, 40, 20);
        Collections.shuffle(info);
        System.out.println(info);

        //写入本地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("z08-io-code\\src\\test\\crawertest\\names.txt"));
        for (String s : info) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }

    /*
     * 获取姓名
     * */
    public static ArrayList<String> getInfo(ArrayList<String> familyName
            , ArrayList<String> boyName, ArrayList<String> girlName, int boyCount, int girlCount) {
        //1.生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }
            Collections.shuffle(familyName);
            Collections.shuffle(boyName);
            boyhs.add(familyName.get(0) + boyName.get(0));
        }
        //2.生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }
            Collections.shuffle(familyName);
            Collections.shuffle(girlName);
            girlhs.add(familyName.get(0) + girlName.get(0));
        }

        //生成数据
        //1.男生
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();

        for (String boyh : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyh + "-男-" + age);
        }
        //1.女生
        for (String girlh : girlhs) {
            int age = r.nextInt(10) + 18;
            list.add(girlh + "-女-" + age);
        }
        return list;
    }

    /*
    作用:根据正则表达式获取字符串中的数据
     */
    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(index);
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
