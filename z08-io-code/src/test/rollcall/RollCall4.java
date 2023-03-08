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
         *
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
