package com.dada.uml.simplefactory.model;

/**
 * @author zhoudahua
 * @date 2019/6/13
 * @description
 */
public class HanMaCar implements Car {
    @Override
    public void carName() {
        System.out.println("这是一部悍马车");
    }

    @Override
    public void getColor() {
        System.out.println("悍马的车身颜色是白色的");
    }
}
