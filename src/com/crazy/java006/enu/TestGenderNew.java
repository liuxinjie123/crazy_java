package com.crazy.java006.enu;

public class TestGenderNew {
    public static void main(String[] args) {
        for (NewGender gender : NewGender.values()) {
            System.out.println(gender);
            System.out.println(gender.name);
            gender.info();
        }
    }
}
