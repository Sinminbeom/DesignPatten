package com.study.DesignPatten._01_creational_patterns.abstract_factory.after;

import com.study.DesignPatten._01_creational_patterns.factorymethod.last.DefaultShipFactory;
import com.study.DesignPatten._01_creational_patterns.factorymethod.last.Ship;
import com.study.DesignPatten._01_creational_patterns.factorymethod.last.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
//        ship.setAnchor(new WhiteAnchor());
//        ship.setWheel(new WhiteWheel());
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
