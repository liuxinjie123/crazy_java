package com.crazy.java006;

public class TestEquals {
    public static void main(String[] args) {
        int a = 65;
        float f1 = 65.0f;
        System.out.println(a==f1);
        char ch = 'A';
        System.out.println(a == ch);
        Person person = new Person();
        Dog dog = new Dog();
        System.out.println("person.equals(dog) ? " + (person.equals(dog)));
        System.out.println("person.equals(\"hello world\") ? " + (person.equals("hello world")));
    }
}
