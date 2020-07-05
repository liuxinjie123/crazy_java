package com.crazy.java005.tree;

public class Leaf extends Mid {
    static {
        System.out.println(" the static initialization block of Leaf.");
    }
    {
        System.out.println(" the common initialization block of Leaf.");
    }
    public Leaf() {
        super("Hello Java.");
        System.out.println(" execute the constructor of Leaf.");
    }
}
