package com.crazy.java006.teach;

public class TeachableProgrammer2 extends Programmer {
    public TeachableProgrammer2() {}
    public TeachableProgrammer2(String name) {
        super(name);
    }
    private void teach() {
        System.out.println(getName() + " is teaching.");
    }
    private class Closure implements Teachable {

        @Override
        public void work() {
            teach();
        }
    }

    //
    public Teachable getCallbackReference() {
        return new Closure();
    }
}
