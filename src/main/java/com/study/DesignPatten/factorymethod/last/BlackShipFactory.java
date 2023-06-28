package com.study.DesignPatten.factorymethod.last;

public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }

}
