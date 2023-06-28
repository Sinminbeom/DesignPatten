package com.study.DesignPatten.factorymethod.last;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
