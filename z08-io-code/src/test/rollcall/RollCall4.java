package test.rollcall;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class RollCall4 {
    public static void main(String[] args) throws IOException {
        /*
         *
         *随机点名器
         * 从name.txt文件中读取数据并随机点名
         * 文件内格式为  张三-男-23      (每行仅有一个数据)
         * 输出其姓名
         *
         * 增加循环点名:点完所有学生后自动开启第二轮点名
         *
         * */
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\test\\crawertest\\names.txt"));
        ArrayList<String> list = new ArrayList<>();
        String s;

        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        while (true) {
            if (list.size() == 0) {
                break;
            }
            Collections.shuffle(list);

            String result = list.remove(0);
            System.out.println(result);
        }

    }

}
