package com.study.DesignPatten.factorymethod.last;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    void sendEmailTo(String email, Ship ship);

    void prepareFor(String name);
    void validate(String name, String email);
}
