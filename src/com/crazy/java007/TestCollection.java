package com.crazy.java007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("孙悟空");
        c.add(6);
        System.out.println(c.size());
        System.out.println(c);
        c.remove(6);
        System.out.println(c);
        c.add("Three Body Problem");
        c.add("平凡的世界");
        System.out.println(c.size());
        System.out.println("c.contains: " + c.contains("Three Body Problem"));
        System.out.println("c.isEmpty: " + c.isEmpty());
        c.clear();
        System.out.println("c.isEmpty: " + c.isEmpty());
    }
}
