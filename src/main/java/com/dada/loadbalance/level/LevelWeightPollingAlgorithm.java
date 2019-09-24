/*
package com.dada.loadbalance.level;

import com.dada.loadbalance.ServiceIps;

import java.util.HashMap;
import java.util.Map;

*/
/**
 * 轮询
 * 平滑加权轮询(负载均衡算法)
 * @author zhoudahua
 * @date 2019/5/17
 * @description
 *//*

public class LevelWeightPollingAlgorithm {
    //key是ip，value是Weight(ip,固定的权重,算出来的权重)
    private static Map<String,Weight> weightMap = new HashMap<>();

    public static String getServerIp() {
        int sum = ServiceIps.WEIGHT_MAP.values().stream().reduce(0, (weight1, wieight2) -> weight1 + wieight2);
        //将 IP 和 权重 重新添加到weightMap中
        if(weightMap.isEmpty()) {
            ServiceIps.WEIGHT_MAP.forEach((ip, value) -> {
                weightMap.put(ip, new Weight(ip, value, value));
            });
        }
        //循环weightMap的value，找出最大的权重的value对象，然后将value对象放到一个
        //临时变量，修改临时变量的currentWeight值(最大权重 - 总权重(结果会有负数，也没有关系))
        //然后将weightMap中所有key对应的value的currentWeight加上固定的weight，然后返回IP，等待下一次请求
        Weight maxWeight = null;
        for (Weight weight : weightMap.values()) {
            if (maxWeight == null || weight.getCurrentWeight() > maxWeight.getCurrentWeight()) {
                maxWeight = weight;
            }
        }
        maxWeight.setCurrentWeight(maxWeight.getWeight() - sum);
        for(Weight weight : weightMap.values()) {
            weight.setCurrentWeight(weight.getCurrentWeight() + weight.getWeight());
        }
        System.out.println(maxWeight.getIp() +"      ");
        return maxWeight.getIp();
    }

    public static void main(String[] args) {
        for(int i = 0;i < 7;i ++) {
            getServerIp();
        }
    }
}
*/
