package com.crazy.java006.gc;

public class TestFinalize2 {
    public static TestFinalize2 tf = null;
    public void info() {
        System.out.println(" test finalize method ...... ");
    }

    public static void main(String[] args) throws InterruptedException {
        new TestFinalize2();

        System.gc();

//        Runtime.getRuntime().runFinalization();
        System.runFinalization();

        tf.info();
    }

    public void finalize() {
        tf = this;
        System.out.println(" the finalize method ...... ");
    }
}
