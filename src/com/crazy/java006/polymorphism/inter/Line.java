package com.crazy.java006.polymorphism.inter;

public class Line implements Shape {
    @Override
    public void erase() {
        System.out.println("erase a line.");
    }

    @Override
    public void drew() {
        System.out.println("draw a line.");
    }
}
