package com.jv.lab.stockmarketsimulator.order.domain;

public enum OrderEnum {

    S("SELL"),
    B("BUY");

    public final String name;

    OrderEnum(String name) {
        this.name = name;
    }
}
