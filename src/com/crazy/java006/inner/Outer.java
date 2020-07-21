package com.crazy.java006.inner;

import com.crazy.java006.lee.Output;

public class Outer {
    private int outProp = 9;

    class Inner {
        private int inProp = 5;
        public void accessOuterProp() {
            // 非静态内部类可以直接访问外部类成员
            System.out.println(" the outProp of out class is: " + outProp);
        }
    }

    public void accessInnerProp() {
        Inner inner = new Inner();
        System.out.println(" the inProp of inner class is: " + inner.inProp);
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInnerProp();
    }
}
