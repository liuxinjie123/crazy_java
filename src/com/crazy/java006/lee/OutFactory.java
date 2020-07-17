package com.crazy.java006.computer;

import com.crazy.java006.lee.Output;
import com.crazy.java006.lee.Printer;

public class OutFactory {
    public Output getOutput() {
        return new Printer();
    }

    public static void main(String[] args) {
        OutFactory factory = new OutFactory();
        Computer c = new Computer(factory.getOutput());
        c.keyIn("Miracle Your Life.");
        c.keyIn("Magic Your Life.");
        c.print();
    }
}
