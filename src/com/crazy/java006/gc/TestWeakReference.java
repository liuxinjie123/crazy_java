package com.crazy.java006.gc;

import java.lang.ref.WeakReference;

public class TestWeakReference {
    public static void main(String[] args) {
        // create a String object
        String str = new String("一切皆有可能");
        // create an weakReference
        WeakReference wr = new WeakReference(str);
        // let str = null
        str = null;
        // get the weakReference object
        System.out.println(wr.get());
        // force run gc
        System.gc();
        System.runFinalization();
        // get the weakReference object
        System.out.println(wr.get());
    }
}
