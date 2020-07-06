package com.crazy.java006;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Apple implements Serializable {
    /**
     * color
     */
    private String color;

    /**
     * weight
     */
    private double weight;

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

//    @Override
//    public String toString() {
//        return "Apple{" +
//                "color='" + color + '\'' +
//                ", weight=" + weight +
//                '}';
//    }
}
