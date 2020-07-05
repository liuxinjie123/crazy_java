package com.crazy.java005.animal;

public class WideWolf extends Wolf {
    public WideWolf() {
        System.out.println("super.name=" + super.name + ", super.age=" + age);
    }
    public static void main(String[] args) {
        new WideWolf();
    }
}
