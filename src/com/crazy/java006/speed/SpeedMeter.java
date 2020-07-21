package com.crazy.java006.speed;

public abstract class SpeedMeter {
    // 转速
    private double turnRate;

    public SpeedMeter() {}

    // 把返回车轮的半径定义成抽象方法
    public abstract double getRadius();

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    // 定义计算速度的通用方法
    public double getSpeed() {
        return 2 * Math.PI * getRadius() * turnRate;
    }
}
