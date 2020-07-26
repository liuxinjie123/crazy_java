package com.crazy.java006.enu;

public class TestGender {
    public static void main(String[] args) {
        Gender g = Enum.valueOf(Gender.class, "FEMALE");
        g.name = "女";
        System.out.println(g + " represent " + g.name);
    }
}
