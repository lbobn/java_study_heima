package com.a08regexdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) throws IOException {
        /*网络爬取
         *
         * */
        //创建URL对象
        URL ur1 = new URL("https://www.baidu.com");
        //连接该网址：需网络畅通
        URLConnection conn = ur1.openConnection();
        //创建对象读取网络中数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line;

        //获取正则表达式对象
        String regex = "(((ht|f)tps?):\\/\\/)?[\\w-]+(\\.[\\w-]+)+([\\w.,@?^=%&:/~+#-]*[\\w@?^=%&/~+#-])?";
        Pattern pattern = Pattern.compile(regex);

        //读取时每次读一行
        while ((line = br.readLine()) != null) {
//            System.out.println(line);
            //拿着文本匹配器的对象matter按照pattern的规则去读取当前这行信息
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        br.close();
    }
}
