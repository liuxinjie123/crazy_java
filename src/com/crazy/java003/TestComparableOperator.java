package com.crazy.java003;

public class TestComparableOperator {
    public static void main(String[] args) {
        TestComparableOperator t1 = new TestComparableOperator();
        TestComparableOperator t2 = new TestComparableOperator();
        System.out.println("t1 == t2 ? " + (t1 == t2));
        System.out.println("t1.equals(t2) ? " + (t1.equals(t2)));
        TestComparableOperator t3 = t1;
        System.out.println("t1 == t3 ? " + (t1 == t3));
        System.out.println("t1.equals(t3) ? " + (t1.equals(t3)));
        Integer a = 2;
        Integer b = 2;
        System.out.println("a == b ? " + (a == b));

        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d ? " + (c == d));

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("s1 == s2 ? " + (s1 == s2));

        System.out.println(new Integer(2) == new Integer(2));
        System.out.println(new Integer(2).equals(new Integer(2)));

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + (str1.equals(str2)));
    }
}
