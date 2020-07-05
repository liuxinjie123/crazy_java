package com.crazy.java005.fruit;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

@Data
public class Apple extends Fruit implements Serializable {
    /**
     * name
     */
    private String name;

    /**
     * color
     */
    private String color;

    public Apple() {}

    public Apple(String name, String color, double weight) {
        this(name, color);
        super.weight = weight;
    }

    public Apple(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.weight = 200;
        System.out.println(JSON.toJSONString(apple));
        apple.info();

    }
}
