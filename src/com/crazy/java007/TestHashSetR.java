package com.crazy.java007;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetR {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));

        System.out.println(hs);

        // fetch the first element
        Iterator iterator = hs.iterator();
        R first = (R) iterator.next();
        first.count = -3;
        System.out.println(hs);
        System.out.println("hs contains -3 ? " + hs.contains(new R(-3)));

        hs.remove(new R(-3));

        System.out.println(hs);
        System.out.println("hs contains -3 ? " + hs.contains(new R(-3)));
        System.out.println("hs contains 5 ? " + hs.contains(new R(5)));

    }
}
