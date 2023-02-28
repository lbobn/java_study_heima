package test.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.put("aaa", "123");
        prop.put("bbb", "456");
        prop.put("ccc", "789");
        prop.put("ddd", "000");

        FileOutputStream fos = new FileOutputStream("z08-io-code\\test.properties");

        prop.store(fos, "test");
        fos.close();
    }
}
