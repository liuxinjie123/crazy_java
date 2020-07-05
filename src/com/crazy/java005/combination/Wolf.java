package com.crazy.java005.combination;

public class Wolf {
    private Animal animal;
    public Wolf(Animal animal) {
        this.animal = animal;
    }
    public void breath() {
        animal.breath();
    }
    public void run() {
        System.out.println(" I can run on the ground.");
    }
}
