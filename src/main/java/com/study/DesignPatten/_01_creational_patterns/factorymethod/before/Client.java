package com.study.DesignPatten._01_creational_patterns.factorymethod.before;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("WhiteShip","alsqja17@naver.com");
        System.out.println(whiteship);
        Ship blackship = ShipFactory.orderShip("BlackShip","alsqja17@naver.com");
        System.out.println(blackship);
    }

}
