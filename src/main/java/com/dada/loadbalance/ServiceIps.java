package com.dada.loadbalance;

import java.util.*;

/**
 * @author zhoudahua
 * @date 2019/5/17
 * @description
 */
public class ServiceIps {

    public static final List<String> IP_LIST = Arrays.asList(
            "192.168.0.0",
            "192.168.0.1",
            "192.168.0.2",
            "192.168.0.3",
            "192.168.0.4",
            "192.168.0.5",
            "192.168.0.6",
            "192.168.0.7",
            "192.168.0.8",
            "192.168.0.9"
    );

    public static final Map<String,Integer> RANDOM_WEIGHT = new LinkedHashMap<>();
    static{
        RANDOM_WEIGHT.put("192.168.0.0",1);
        RANDOM_WEIGHT.put("192.168.0.1",8);
        RANDOM_WEIGHT.put("192.168.0.2",3);
        RANDOM_WEIGHT.put("192.168.0.3",6);
        RANDOM_WEIGHT.put("192.168.0.4",5);
        RANDOM_WEIGHT.put("192.168.0.5",5);
        RANDOM_WEIGHT.put("192.168.0.6",4);
        RANDOM_WEIGHT.put("192.168.0.7",7);
        RANDOM_WEIGHT.put("192.168.0.8",2);
        RANDOM_WEIGHT.put("192.168.0.9",9);
    }

    public static final Map<String,Integer> WEIGHT_MAP = new LinkedHashMap<>();
    static{
        WEIGHT_MAP.put("A",5);
        WEIGHT_MAP.put("B",1);
        WEIGHT_MAP.put("C",1);
    }


}
