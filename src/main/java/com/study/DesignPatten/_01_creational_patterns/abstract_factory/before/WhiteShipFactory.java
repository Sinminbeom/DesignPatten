package com.study.DesignPatten._01_creational_patterns.abstract_factory.before;

import com.study.DesignPatten._01_creational_patterns.factorymethod.last.Ship;
import com.study.DesignPatten._01_creational_patterns.factorymethod.last.WhiteShip;
import com.study.DesignPatten._01_creational_patterns.factorymethod.last.DefaultShipFactory;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
