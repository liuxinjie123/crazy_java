package com.crazy.java005.combination;

public class Bird {
    private Animal animal;
    public Bird(Animal animal) {
        this.animal = animal;
    }
    public void breath() {
        animal.breath();
    }
    public void fly() {
        System.out.println(" I can fly freely in the sky. ");
    }
}
