package com.dada.uml.simplefactory.test;

import com.dada.uml.simplefactory.factory.CarFactory;
import com.dada.uml.simplefactory.model.AudiCar;
import com.dada.uml.simplefactory.model.BMWCar;
import com.dada.uml.simplefactory.model.Car;
import com.dada.uml.simplefactory.model.HanMaCar;

/**
 * @author zhoudahua
 * @date 2019/6/13
 * @description
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        System.out.println("第一次造车是奥迪车");
        Car audi = CarFactory.createCar(AudiCar.class);
        audi.carName();
        audi.getColor();

        System.out.println();
        System.out.println("第一次造车是宝马车");
        Car bmw = CarFactory.createCar(BMWCar.class);
        bmw.carName();
        bmw.getColor();

        System.out.println();
        System.out.println("第一次造车是悍马车");
        Car hanMa = CarFactory.createCar(HanMaCar.class);
        hanMa.carName();
        hanMa.getColor();
    }
}
