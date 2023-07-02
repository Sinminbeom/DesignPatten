package com.study.DesignPatten._01_creational_patterns.singleton;

public enum EnumSettings {
    INSTANCE;

    EnumSettings() {
    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
