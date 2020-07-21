package com.crazy.java006.polymorphism.inter;

public class TestInter {
    void doStuff(Shape shape) {
        shape.erase();
        shape.drew();
    }

    public static void main(String[] args) {
        TestInter main = new TestInter();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Line line = new Line();
        main.doStuff(circle);
        main.doStuff(triangle);
        main.doStuff(line);
    }
}
