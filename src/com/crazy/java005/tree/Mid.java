package com.crazy.java005.tree;

public class Mid extends Root {
    static {
        System.out.println(" the static initialization block of Mid.");
    }
    {
        System.out.println(" the common initialization block of Mid.");
    }
    public Mid() {
        System.out.println(" the constructor of Mid with on parameter.");
    }
    public Mid(String msg) {
        this();
        System.out.println(" the constructor of Mid with msg parameter.");
    }
}
