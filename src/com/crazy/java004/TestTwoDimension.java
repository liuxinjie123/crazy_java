package com.crazy.java004;

public class TestTwoDimension {
    public static void main(String[] args) {
        int[][] a;
        a = new int[3][];
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("\n");

        a[0] = new int[2];
        a[0][1] = 6;
        for (int i=0; i<a[0].length; i++) {
            System.out.println(a[0][i]);
        }

        System.out.println("\n");

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
