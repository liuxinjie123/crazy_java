package com.crazy.java006;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Dog implements Serializable {
    /**
     * color
     */
    private String color;

    /**
     * type
     */
    private String type;
}
