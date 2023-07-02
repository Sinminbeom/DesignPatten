package com.study.DesignPatten._01_creational_patterns.abstract_factory.after;

import com.study.DesignPatten._01_creational_patterns.factorymethod.last.Ship;
import com.study.DesignPatten._01_creational_patterns.factorymethod.last.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
//        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship.getName() = " + ship.getName());
        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getAnchor().getClass() = " + ship.getWheel().getClass());

    }
}
