package com.crazy.java006;

public class NullAccessStatic {
    public static void test() {
        System.out.println(" static test method.");
    }

    public static void main(String[] args) {
        NullAccessStatic nullAccessStatic = null;
        nullAccessStatic.test();
    }
}
