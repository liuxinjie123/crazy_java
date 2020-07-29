package com.crazy.java006.gc;

public class TestFinalize {
    public static TestFinalize tf = null;
    public void info() {
        System.out.println(" test finalize method ...... ");
    }

    public static void main(String[] args) throws InterruptedException {
        new TestFinalize();

        System.gc();

        Thread.sleep(5000);

        tf.info();
    }

    public void finalize() {
        tf = this;
        System.out.println(" the finalize method ...... ");
    }
}
