package com.crazy.java006.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double callPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public String getType() {
        return "circle";
    }

    public static void main(String[] args) {
        Shape s1 = new Triangle("Black", 3, 4, 5);
        Shape s2 = new Circle("White", 3);
        System.out.println(s1.getType());
        System.out.println(s1.callPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.callPerimeter());
    }
}
