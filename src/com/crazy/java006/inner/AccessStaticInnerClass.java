package com.crazy.java006.inner;

public class AccessStaticInnerClass {
    static class StaticInnerClass {
        private static int prop1 = 5;
        private int prop2 = 3;
    }
    public void accessInnerProp() {
        System.out.println(StaticInnerClass.prop1);
        System.out.println(new StaticInnerClass().prop2);
    }

    public static void main(String[] args) {
        AccessStaticInnerClass access = new AccessStaticInnerClass();
        access.accessInnerProp();
    }
}
