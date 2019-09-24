package com.dada.jedis.hack;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhoudahua
 * @date 2019/6/26
 * @description
 */
public class RedisHack {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket accept = serverSocket.accept();
            byte[] bytes = new byte[1024];
            accept.getInputStream().read(bytes);
            System.out.println("服务器启动");
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
