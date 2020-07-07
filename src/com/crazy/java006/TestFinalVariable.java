package com.crazy.java006;

public class TestFinalVariable {
    {
        name = "jack";
    }
    private final String name;

    final int a = 6;
    final String str;
    final int c;
    final static double d;
    {
        str = "Hello";
    }
    static {
        d = 6.6;
    }

    public TestFinalVariable() {
//        name = "jack";
        c = 666;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        final String test;
        test = "test";
        System.out.println(test);
        TestFinalVariable finalVariable = new TestFinalVariable();
        System.out.println(finalVariable.a);
        System.out.println(finalVariable.c);
        System.out.println(finalVariable.name);
        System.out.println(finalVariable.str);
    }
}
