package com.study.DesignPatten._01_creational_patterns.factorymethod.last;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
