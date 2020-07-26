package com.crazy.java006.enu;

public class TestEnum {
    public void judge(SeasonEnum s) {
        switch (s) {
            case SPRING:
                System.out.println("春暖花开，正好踏青");
                break;
            case SUMMER:
                System.out.println("夏日炎炎，正好游泳");
                break;
            case AUTUMN:
                System.out.println("秋高气爽，气候适宜");
                break;
            case WINDER:
                System.out.println("冬日飘雪，欣赏飘雪");
                break;
        }
    }

    public static void main(String[] args) {
        for (SeasonEnum season : SeasonEnum.values()) {
            System.out.println(season);
        }
        new TestEnum().judge(SeasonEnum.SPRING);
    }
}
