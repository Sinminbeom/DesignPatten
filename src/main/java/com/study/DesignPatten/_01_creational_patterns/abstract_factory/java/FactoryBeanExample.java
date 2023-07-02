package com.study.DesignPatten._01_creational_patterns.abstract_factory.java;

import com.study.DesignPatten._01_creational_patterns.factorymethod.last.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanExample {
    public static void main(String[] args) throws Exception {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
//        Ship whiteship = ac.getBean("whiteship", Ship.class);
//        System.out.println(whiteship.getName());

        ApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
//        ShipFactory shipFactory = ac.getBean(ShipFactory.class);
//        System.out.println(shipFactory.getObject());
        Ship ship = ac.getBean(Ship.class);
        System.out.println(ship);
    }
}
