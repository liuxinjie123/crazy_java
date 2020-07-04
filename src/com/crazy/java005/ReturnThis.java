package com.crazy.java005;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ReturnThis implements Serializable {
    /**
     * age
     */
    private int age;

    public int getAge() {
        return age;
    }

    public ReturnThis grow() {
        age ++;
        return this;
    }

    public static void main(String[] args) {
        ReturnThis obj = new ReturnThis();
        obj.grow()
                .grow()
                .grow()
                .grow()
                .grow();
        System.out.println("age: " + obj.getAge());
    }
}
