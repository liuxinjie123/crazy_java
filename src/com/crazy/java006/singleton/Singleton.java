package com.crazy.java006.singleton;

public class Singleton {

    private static Singleton singleton;
    /**
     * private constructor
     */
    private Singleton() {}

    public static Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
