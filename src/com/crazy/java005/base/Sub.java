package com.crazy.java005.base;

public class Sub extends Base {
    private String name = "";

    public void test() {
        System.out.println("Sub.java override Base.java method, the name filed length: " + name.length());
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}
