package com.crazy.java006.speed;

public class CarSpeedMeter extends SpeedMeter {
    @Override
    public double getRadius() {
        return 0.28;
    }

    public static void main(String[] args) {
        CarSpeedMeter car = new CarSpeedMeter();
        car.setTurnRate(15);
        System.out.println("car speed: " + car.getSpeed());
    }
}
