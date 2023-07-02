package com.study.DesignPatten._01_creational_patterns.factorymethod.last;

import com.study.DesignPatten._01_creational_patterns.abstract_factory.after.Anchor;
import com.study.DesignPatten._01_creational_patterns.abstract_factory.after.Wheel;

public abstract class Ship {
    private String name;
    private String logo;
    private String color;
    private Wheel wheel;
    private Anchor anchor;

    public Ship(String name, String logo, String color) {
        this.name = name;
        this.logo = logo;
        this.color = color;
    }

    public Ship() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
