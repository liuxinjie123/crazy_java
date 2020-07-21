package com.crazy.java006.polymorphism.abstr;

public class PolymorphismTest {
    void doStuff(Shape shape) {
        shape.erase();
        shape.draw();
    }

    public static void main(String[] args) {
        PolymorphismTest poly = new PolymorphismTest();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Line line = new Line();
        poly.doStuff(circle);
        poly.doStuff(triangle);
        poly.doStuff(line);
    }
}
