package com.crazy.java003;

public class TestFloat {
    public static void main(String[] args) {
        float af = 5.2345556f;
        System.out.println(" af=" + af);
        double a = 0.0;
        double c = Double.POSITIVE_INFINITY;
        float d = Float.POSITIVE_INFINITY;
        System.out.println("c==d ? " + (c == d));
        System.out.println(a / a);
        System.out.println(a / a == Float.NaN);
        System.out.println(6.0 / 0 == 666.0 / 0);
        System.out.println(-8 / 0.0);
        System.out.println(0 / 0);
    }
}
