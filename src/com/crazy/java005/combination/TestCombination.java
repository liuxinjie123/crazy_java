package com.crazy.java005.combination;

public class TestCombination {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird(animal);
        bird.breath();
        bird.fly();

        System.out.printf("\n");

        Wolf wolf = new Wolf(animal);
        wolf.breath();
        wolf.run();
    }
}
