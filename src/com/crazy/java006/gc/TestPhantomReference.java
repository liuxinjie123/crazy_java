package com.crazy.java006.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class TestPhantomReference {
    public static void main(String[] args) throws InterruptedException {
        // create a String object
        String str = "Today is a beautiful day.";
        // create a reference queue
        ReferenceQueue rq = new ReferenceQueue();
        // create a phantomReference, this phantomReference refer to str
        PhantomReference pr = new PhantomReference(str, rq);
        // let str = null
        str = null;
        // get phantomReference object value
        System.out.println(pr.get());
        System.out.println(rq.poll() == pr);
        // force run gc
        System.gc();
        System.runFinalization();
        Thread.sleep(1000);
        // fetch the first element of rq, check if it equals pr
        System.out.println(rq.poll() == pr);

    }
}
