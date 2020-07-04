package com.crazy.java005;

public class TestPrimitiveTransfer {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap method, a= " + a + ", b=" + b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a, b);
        System.out.println("in the end, a=" + a + ", b=" + b);
    }
}
