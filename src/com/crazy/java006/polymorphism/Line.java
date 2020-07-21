package com.crazy.java006.polymorphism;

public class Line extends Shape {
    @Override
    void erase() {
        System.out.println("erase a line.");
    }

    @Override
    void draw() {
        System.out.println("draw a line.");
    }
}
