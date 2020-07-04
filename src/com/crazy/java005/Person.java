package com.crazy.java005;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Person implements Serializable {
    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private int age;

    public void say(String content) {
        System.out.println(content);
    }
}
