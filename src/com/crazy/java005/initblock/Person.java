package com.crazy.java005.initblock;

public class Person {
    // refine the first initialization block
    {
        int a = 6;
        if (a > 4) {
            System.out.println(" Person initialization block, local variable a > 4");
        }
        System.out.println(" Person initialization block.");
    }
    // refine the second initialization block
    {
        System.out.println(" the second Person initialization block.");
    }
    public Person () {
        System.out.println(" the constructor of Person.class with no field.");
    }

    public static void main(String[] args) {
        new Person();
    }
}
