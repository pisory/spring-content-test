package com.dada.jedis.connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author zhoudahua
 * @date 2019/6/26
 * @description
 */
public class Connection {
    private String host;
    private int port;
    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;

    public Connection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    /**
     * 连接
     */
    public void connect() {
        try {
            socket = new Socket(host, port);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 连接
     * 发送命令
     * 返回连接
     * @return
     * @param key
     * @param value
     */
    public Connection sendCommand(String key, String value) {
        //连接
        connect();
        //返回连接
        return this;
    }
}
