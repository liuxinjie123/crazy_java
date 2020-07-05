package com.crazy.java005.fruit;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Fruit implements Serializable {
    /**
     * weight
     */
    public double weight;

    public void info() {
        System.out.println("This is a fruit, weight: " + weight + "g！");
    }
}
