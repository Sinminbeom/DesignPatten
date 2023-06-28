package com.study.DesignPatten.factorymethod.java;

import com.study.DesignPatten.factorymethod.after.BlackShip;
import com.study.DesignPatten.factorymethod.after.WhiteShip;

public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")){
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
