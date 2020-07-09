package com.crazy.java006;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    /**
     * age
     */
    private int age;

    /**
     * name
     */
    private final Name name;

    public Person() {
        this.name = null;
    }
    public Person(int age) {
        this.age = age;
        this.name = null;
    }

    public Person(Name name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        return true;
    }

    public static void main(String[] args) {
        Name name = new Name("悟空", "孙");
        Person person = new Person(name);
        System.out.println(person);
        name.setFirstName("八戒");
        System.out.println(person);
        System.out.println(person.getName());
        name.setFirstName("悟空");
        System.out.println(person.getName());
    }
}
