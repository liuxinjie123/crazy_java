package com.crazy.java006.polymorphism.abstr;

public class Circle extends Shape {
    @Override
    void erase() {
        System.out.println("erase a circle.");
    }

    @Override
    void draw() {
        System.out.println("draw a circle.");
    }
}
