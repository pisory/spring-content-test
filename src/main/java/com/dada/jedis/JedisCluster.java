package com.dada.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author zhoudahua
 * @date 2019/6/26
 * @description
 */
public class JedisCluster {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",8888);
        jedis.set("name","jedis");
        String value = jedis.get("");
    }
}
