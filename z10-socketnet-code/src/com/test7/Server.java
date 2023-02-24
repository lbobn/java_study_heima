package com.test7;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        //服务器：接收多次接收数据，并打印

        //浏览器:127.0.0.1:10086

        //1.创建对象绑定10086端口
        ServerSocket ss = new ServerSocket(10086);

        //2.等待客户端来连接
        Socket socket = ss.accept();

        //3.读取数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }

        //4.释放资源
        socket.close();
        ss.close();
    }


}
