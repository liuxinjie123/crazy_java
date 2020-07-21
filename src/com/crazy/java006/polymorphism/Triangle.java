package com.crazy.java006.polymorphism;

public class Triangle extends Shape {
    @Override
    void erase() {
        System.out.println("erase a triangle.");
    }

    @Override
    void draw() {
        System.out.println("draw a triangle.");
    }
}
