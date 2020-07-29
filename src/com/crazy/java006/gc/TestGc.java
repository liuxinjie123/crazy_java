package com.crazy.java006.gc;

public class TestGc {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            new TestGc();
            System.out.println(i + " ..................... ");
            Runtime.getRuntime().gc();
        }
    }
    public void finalize() {
        System.out.println(" system is cleaning TestGc object resource ...... ");
    }
}
