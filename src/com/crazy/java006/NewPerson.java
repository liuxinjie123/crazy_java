package com.crazy.java006;

import java.io.Serializable;

public class NewPerson implements Serializable {
    /**
     * name
     */
    private final Name name;

    public NewPerson(Name name) {
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName() {
        return name;
//        return new Name(name.getFirstName(), name.getLastName());
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name=" + name +
                '}';
    }

    public static void main(String[] args) {
        Name name = new Name("悟空", "孙");
        NewPerson person = new NewPerson(name);
        System.out.println(person);
        System.out.println(person.getName());
        name.setFirstName("八戒");
        System.out.println(person);
        System.out.println(person.getName());
    }
}
