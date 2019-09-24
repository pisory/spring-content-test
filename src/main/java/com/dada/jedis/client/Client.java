package com.dada.jedis.client;

import com.dada.jedis.connection.Connection;
import redis.clients.jedis.params.SetParams;

/**
 * API操作层：提供操作的接口
 * @author zhoudahua
 * @date 2019/6/26
 * @description
 */
public class Client {

    private Connection connection;

    public Client(String host, int port) {
        this.connection = new Connection(host, port);
    }

    public String set(String key, String value) {
        connection.sendCommand(key, value);
        return null;
    }

    public String get(String key) {
        return  null;
    }
}
