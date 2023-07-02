package com.study.DesignPatten._01_creational_patterns.factorymethod.after;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
