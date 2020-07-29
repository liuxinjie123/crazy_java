package com.crazy.java006.gc;

import java.lang.ref.WeakReference;

public class TestWeakReferenceNew {
    public static void main(String[] args) throws InterruptedException {
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
        Object obj = wr.get();
        if (obj == null) {
            str = new String("一切皆有可能1");
            wr = new WeakReference(str);
            str = null;
            obj = wr.get();
        }
        System.out.println(obj);
        obj = null;

        // force run gc
        System.gc();
        System.runFinalization();

        // get the weakReference object
        if (null == obj) {
            obj = new String("一切皆有可能2");
            wr = new WeakReference(obj);
        }
        System.out.println(obj);
        obj = null;

        // force run gc
        System.gc();
        System.runFinalization();

        // get the weakReference object
        if (null == obj) {
            str = new String("家、幸福、梦想");
            wr = new WeakReference(str);
            str = null;
            obj = wr.get();
            System.out.println(obj);
            obj = null;

            // force run gc
            System.gc();
            System.runFinalization();

//            Thread.sleep(5000);
            obj = wr.get();
            System.out.println(obj);
        }

        // force run gc
        System.gc();
        System.runFinalization();
    }
}
