package com.crazy.java006;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Person implements Serializable {
    public boolean equals(Object object) {
        return true;
    }
}
