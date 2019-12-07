package com.spring.listener;

import com.spring.listener.card.BlackCard;
import com.spring.listener.card.RedCard;

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
