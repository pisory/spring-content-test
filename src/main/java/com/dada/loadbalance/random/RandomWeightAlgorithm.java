/*
package com.dada.loadbalance.random;

import com.dada.loadbalance.ServiceIps;

import java.util.Random;

*/
/**
 * 负载均衡 -- 随机加权算法
 * @author zhoudahua
 * @date 2019/5/17
 * @description
 *//*

public class RandomWeightAlgorithm {

    public static String getIp() {

        //算出所有的权重，然后根据权重随机出一个数，然后从map的value开始循环比较当前的随机数，如果随机数小于等于当前的value，直接返回
        //否则，随机数 - value 后，再循环下个value1，再一次比较，如果小于等于则返回value1，否则 随机数 - value1,
        // 然后在循环下一个value2...,直到循环完map的value(随机一定是 <= 权重的总和的，所以循环到最后，肯定是有个数的)
        int totalWeight = ServiceIps.RANDOM_WEIGHT.values().stream().reduce(0, (x,y) -> x+y);

        Random random = new Random();
        int position = random.nextInt(totalWeight);
        */
/*boolean isSameWeight = true;*//*


        for(String ip : ServiceIps.RANDOM_WEIGHT.keySet()) {
            int weight = ServiceIps.RANDOM_WEIGHT.get(ip);
            if(position < weight) {
                return ip;
            }else {
                position = position - weight;
            }
        }
        return (String)ServiceIps.RANDOM_WEIGHT.keySet().toArray()[(random.nextInt(ServiceIps.RANDOM_WEIGHT.size()))];
    }

    public static void main(String[] args) {
        for(int i = 0;i < 10;i ++) {
            System.out.println(getIp());
        }
    }
}
*/
