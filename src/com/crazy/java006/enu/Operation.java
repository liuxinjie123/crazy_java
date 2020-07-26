package com.crazy.java006.enu;

public enum Operation {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE;

    double eval(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case MULTIPLY:
                return x * y;
            case DIVIDE:
                return  x / y;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3, 4));
    }
}
