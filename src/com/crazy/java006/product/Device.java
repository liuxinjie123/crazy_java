package com.crazy.java006.product;

import lombok.Data;

@Data
abstract class Device {
    private String name;
    public abstract double getPrice();
    public Device(){}
    public Device(String name) {
        this.name = name;
    }
}
