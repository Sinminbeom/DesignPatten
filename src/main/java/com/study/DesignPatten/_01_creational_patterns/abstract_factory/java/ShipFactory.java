package com.study.DesignPatten._01_creational_patterns.abstract_factory.java;

import com.study.DesignPatten._01_creational_patterns.factorymethod.last.Ship;
import com.study.DesignPatten._01_creational_patterns.factorymethod.last.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
