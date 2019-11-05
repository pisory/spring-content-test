package com.spring.listener;

/**
 * @author dada
 * @date 2019/11/4
 * @description
 */
public class ListenerTest {
    public static void main(String[] args) {
        StreetLight streetLight = new StreetLight();
        streetLight.addListener(new RedCard());
        streetLight.addListener(new BlackCard());
        streetLight.lighting(2);
    }
}
