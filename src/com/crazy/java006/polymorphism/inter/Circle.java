package com.crazy.java006.polymorphism.inter;

public class Circle implements Shape {
    @Override
    public void erase() {
        System.out.println("erase a circle.");
    }

    @Override
    public void drew() {
        System.out.println("draw a circle.");
    }
}
