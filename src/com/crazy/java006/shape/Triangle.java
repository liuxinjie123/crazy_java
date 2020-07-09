package com.crazy.java006.shape;

import lombok.Data;

@Data
public class Triangle extends Shape {
    /**
     * define the three sides of a triangle
     */
    private double a;
    private double b;
    private double c;

    public void setSides(double a, double b, double c) {
        if (a >= b+c || b >= a+c || c >= a+b) {
            System.out.println("the sum of two sides of a triangle must be greater than the third.");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSides(a, b, c);
    }

    @Override
    public double callPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return "triangle";
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("blue", 3, 4, 5);
        System.out.println(triangle.toString());
        triangle = new Triangle("green", 3, 3, 6);
        System.out.println(triangle);
    }
}
