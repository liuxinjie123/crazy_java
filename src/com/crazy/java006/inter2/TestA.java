package com.crazy.java006.inter2;

public class TestA {
    public static void main(String[] args) {
        int age = 0;
        A a = new A() {
            @Override
            public void test() {
                System.out.println("age: " + age);
            }
        };
        a.test();
    }
}
