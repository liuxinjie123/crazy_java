package com.crazy.java006.enu;

public enum Operation2 {
    PLUS {
        public double eval(double x, double y) {
            return x + y;
        }
    },

    MINUS {
        public double eval(double x, double y) {
            return x - y;
        }
    },

    MULTIPLY {
        public double eval(double x, double y) {
            return  x * y;
        }
    },

    DEVIDED {
        public double eval(double x, double y) {
            return  x / y;
        }
    };

    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(Operation2.PLUS.eval(3, 4));
        System.out.println(Operation2.MULTIPLY.eval(3, 4));
    }
}
