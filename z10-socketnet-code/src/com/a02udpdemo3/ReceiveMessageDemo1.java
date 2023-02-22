package com.a02udpdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            组播接收端代码
        */


        //1. 创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket(10086);

        //将本机添加到224.0.0.1这组当中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //接收数据:创建DatagramPacket数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);


        //接收数据:
        ms.receive(dp);

        //3.解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();

        System.out.println("ip为：" + ip + ",主机名为：" + name + "的人，发送了数据：" + new String(data, 0, len));


        //4.释放资源
        ms.close();
    }
}
