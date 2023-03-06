package test.rollcall;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RollCall {
    public static void main(String[] args) throws IOException {

        /*
         * 随机点名器
         * 从name.txt文件中读取数据并随机点名
         * 文件内格式为  张三-男-23      (每行仅有一个数据)
         * 输出其姓名
         *
         * */
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\test\\crawertest\\names.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        br.close();

        Collections.shuffle(list);

        String name = list.get(0).split("-")[0];
        System.out.println(name);
    }
}
