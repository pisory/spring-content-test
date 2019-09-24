package com.dada.loadbalance.random;

import com.dada.loadbalance.ServiceIps;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

/**
 * 负载均衡 -- 随机算法
 * @author zhoudahua
 * @date 2019/5/17
 * @description
 */
public class RandomAlgorithm {

    public static String getIp() {
        Random random = new Random();
        int position = random.nextInt(ServiceIps.IP_LIST.size());
        return ServiceIps.IP_LIST.get(position);
    }

    public static void main(String[] args) {
        for(int i = 0;i < 10;i ++) {
            /*System.out.println(getIp());*/
            System.out.println(ServiceIps.IP_LIST.get(new Random().nextInt(ServiceIps.IP_LIST.size())));
        }
    }
}
