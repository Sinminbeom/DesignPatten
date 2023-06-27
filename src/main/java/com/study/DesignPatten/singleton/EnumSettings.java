package com.study.DesignPatten.singleton;

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
