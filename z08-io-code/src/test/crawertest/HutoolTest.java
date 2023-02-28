package test.crawertest;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

public class HutoolTest {
    public static void main(String[] args) {
        /*
        制造假数据:
        获取姓氏: https: / / hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0获取男生名字:http:// www.haoming8.cn/baobao/10881.html
        获取女生名字: http : / /www. haoming8.cn/baobao/7641.html
        */


        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        //爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);
        //根据正则表达式获取想要的内容
        List<String> familyNameTempStr = ReUtil.findAll("(.{4})(。|，)", familyNameStr, 1);
        List<String> boyNameTempStr = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(。|、)", boyNameStr, 1);
        List<String> girlNameTempStr = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

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
        ArrayList<String> info = getInfo(familyName, boyName, girlName, 20, 15);
        Collections.shuffle(info);
        System.out.println(info);

        //写入文件(class文件夹内)
        FileUtil.writeLines(info, "names.txt", "UTF-8");
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
}
