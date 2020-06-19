package com.crazy.java003;

public class NarrowConversion {
    public static void main(String[] args) {
        int iValue = 233;
        System.out.println("iValue=" + iValue);
        byte bValue = (byte) iValue;
        System.out.println("bValue=" + bValue);
        double dValue = 3.98;
        System.out.println("dValue=" + dValue);
        int tol = (int) dValue;
        System.out.println("tol=" + tol);
    }
}
