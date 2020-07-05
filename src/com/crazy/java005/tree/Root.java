package com.crazy.java005.tree;

public class Root {
    static {
        System.out.println(" the static initialization block of Root.");
    }
    {
        System.out.println(" the common initialization block of Root.");
    }
    public Root() {
        System.out.println(" the constructor of Root with on field.");
    }
}
