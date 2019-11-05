package com.spring.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 被观察者要持有监听的观察者引用
 * @author dada
 * @date 2019/11/4
 * @description
 */
public class StreetLight {

    List<CardListener> listener = new ArrayList();

    public void addListener(CardListener listener) {
        this.listener.add(listener);
    }

    public void lighting(int type) {
        TurnEvent event = new TurnEvent();
        event.setType(type);
        for (CardListener cardListener : listener) {
            cardListener.turn(event);
        }
    }
}
