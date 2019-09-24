package com.dada.uml.simplefactory.factory;

import com.dada.uml.simplefactory.model.Car;

/**
 * 简单工厂方法/静态工厂方法
 * @author zhoudahua
 * @date 2019/6/13
 * @description
 */
public class CarFactory {
    public static <T extends Car> T createCar(Class<T> c) {
        Car car = null;
        try {
            car = (Car) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("造车失败！");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
