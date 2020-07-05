package com.crazy.java005.animal;

public class Animal extends Creature {
    /**
     * name
     */
    public String name;

    /**
     * age
     */
    public int age;
    public Animal(String name) {
        System.out.println("the constructor of Animal with name field, name=" + name);
    }
    public Animal(String name, int age) {
        this(name);
        System.out.println("the constructor of Animal with name field, age field, age=" + age);
    }
}
