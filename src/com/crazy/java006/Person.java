package com.crazy.java006;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Person implements Serializable {
    /**
     * age
     */
    private int age;

    public Person(int age) {
        this.age = age;
    }



    public boolean equals(Object object) {
        return true;
    }
}
