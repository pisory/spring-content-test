package com.spring.listener.card;

import com.spring.listener.CardListener;
import com.spring.listener.TurnEvent;

/**
 * @author dada
 * @date 2019/11/4
 * @description
 */
public class RedCard implements CardListener {
    @Override
    public void turn(TurnEvent event) {
        if (event.getType() == 1) {
            System.out.println("turn right");
        }else if(event.getType() == 2) {
            System.out.println("stop");
        }
    }
}
