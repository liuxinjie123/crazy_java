package com.crazy.java006.teach;

public class TeachableProgrammer extends Programmer implements Teachable {
    public void work() {
        System.out.println(super.getName() + " is teaching.");
    }
}
