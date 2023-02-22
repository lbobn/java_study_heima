package com.a02udpdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
            组播发送端代码
        */

        //创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket(10000);

        //2.打包数据


        String str = "你好";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //3.发送数据
        ms.send(dp);


        //4.释放资源
        ms.close();

    }
}
