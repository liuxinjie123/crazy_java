package com.crazy.java006.teach;

import lombok.Data;

@Data
public class Programmer {
    private String name;
    public Programmer() {}
    public Programmer(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is programming.");
    }
}
