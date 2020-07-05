package com.crazy.java005.initblock;

/**
 * when create an object, the system will allocate memory for all fields first after the class is loaded.
 * then the system will init the fields
 * 1. the initialize value in the initialization block.
 * 2. the initialize value when declaring a field.
 * 3. the initialize value in the constructor.
 */
public class TestInstanceInit {
    // execute initialization block first, a=6
    {
        a = 6;
    }
    // execute here after initialization block, a= 9
    int a = 9;

    public static void main(String[] args) {
        System.out.println(new TestInstanceInit().a);
    }
}
