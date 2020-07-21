package com.crazy.java006.polymorphism.inter;

public class Triangle implements Shape {
    @Override
    public void erase() {
        System.out.println("erase a triangle.");
    }

    @Override
    public void drew() {
        System.out.println("draw a triangle.");
    }
}
