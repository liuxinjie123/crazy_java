package com.crazy.java006.shape;

public abstract class Shape {
    {
        System.out.println("execute the initialization block of Shape.");
    }
    private String color;

    public abstract double callPerimeter();

    public abstract String getType();

    public Shape() {}

    public Shape(String color) {
        System.out.println("execute the constructor of Shape.");
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
