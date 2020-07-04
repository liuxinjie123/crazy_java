package com.crazy.java005;

public class Recrusive {
    public static int fn(int n) {
        if (0 == n || 1 == n) {
            return 1;
        }
        return 2*fn(n-1) + fn(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fn(1));
        System.out.println(fn(3));
        System.out.println(fn(5));
        System.out.println(fn(10));
    }
}
