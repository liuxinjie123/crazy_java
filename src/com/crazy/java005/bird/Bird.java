package com.crazy.java005.bird;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Bird implements Serializable {
    /**
     * fly method
     */
    public void fly() {
        System.out.println("I'm flying in the sky ...");
    }
}
