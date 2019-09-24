package com.dada.uml.simplefactory.model;

/**
 * @author zhoudahua
 * @date 2019/6/13
 * @description
 */
public class AudiCar implements Car {
    @Override
    public void carName() {
        System.out.println("这是一部奥迪车");
    }

    @Override
    public void getColor() {
        System.out.println("奥迪车身颜色是黑色的");
    }
}
