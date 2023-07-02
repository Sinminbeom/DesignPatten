package com.study.DesignPatten._01_creational_patterns.factorymethod.after;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }

}
