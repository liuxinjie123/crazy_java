package com.crazy.java006.teach;

public class TestTeachableProgrammer {
    public static void main(String[] args) {
        TeachableProgrammer2 teach = new TeachableProgrammer2("JACK");
        teach.work();
        System.out.println("\n");
        teach.getCallbackReference().work();
    }
}
