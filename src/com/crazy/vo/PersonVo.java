package com.crazy.vo;

import java.io.Serializable;

public class PersonVo implements Serializable {
    /**
     * name
     */
    private String name;
    /**
     * age
     */
    private int age;
    /**
     * height
     */
    private double height;

    public PersonVo() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonVo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
