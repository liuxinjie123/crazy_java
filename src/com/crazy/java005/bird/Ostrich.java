package com.crazy.java005.bird;

import com.crazy.java005.bird.Bird;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Ostrich extends Bird implements Serializable {
    @Override
    public void fly() {
        System.out.println("I can only running on the ground.");
    }

    public void parentFly() {
        super.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
        Bird os2 = null;
        os2 = new Ostrich();
        os2.fly();
        ostrich.parentFly();
    }
}
