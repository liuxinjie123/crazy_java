package com.crazy.java006.lee;

public class OutFactory {
    public Output getOutput() {
        return new Printer();
    }

    public Output getBetterOutput() {
        return new BetterPrinter();
    }

    public static void main(String[] args) {
        OutFactory factory = new OutFactory();
        Computer c = new Computer(factory.getOutput());
        c.keyIn("Miracle Your Life.");
        c.keyIn("Magic Your Life.");
        c.print();

        Computer c2 = new Computer(factory.getBetterOutput());
        c2.keyIn("Welcome to Shanghai.");
        c2.keyIn("I love you.");
        c2.print();
    }
}
