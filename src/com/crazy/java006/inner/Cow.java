package com.crazy.java006.inner;

import lombok.Data;

public class Cow {
    private double weight;
    // 外部类的两个重载构造器
    public Cow() {}
    public Cow(double weight) {
        this.weight = weight;
    }
    // 定义一个非静态内部类
    @Data
    private class CowLeg {
        // 非静态内部类的2个属性
        private double length;
        private String color;
        // 非静态内部类的两个重载构造器
        private CowLeg() {}

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }
        // non static inner class method
        public void info() {
            System.out.println(" the color of cowleg is: " + color + ", length is: " + length);
            System.out.println(" the weight of the cow is: " + weight);
        }
    }

    public void test() {
        CowLeg cowLeg = new CowLeg(1.0, "黑白相间");
        cowLeg.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(366.0);
        cow.test();
    }
}
