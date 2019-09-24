package com.dada.uml.simplefactory.model;

/**
 * @author zhoudahua
 * @date 2019/6/13
 * @description
 */
public class BMWCar implements Car {
    @Override
    public void carName() {
        System.out.println("这是一部宝马");
    }

    @Override
    public void getColor() {
        System.out.println("宝马车身颜色是宝马灰");
    }
}
