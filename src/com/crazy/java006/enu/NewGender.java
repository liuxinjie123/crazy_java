package com.crazy.java006.enu;

public enum NewGender implements GenderDesc {
    MALE("男"),
    FEMALE("女");

    public String name;
    NewGender(){}
    NewGender(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println(" this is a enum which describe gender.");
    }
}
