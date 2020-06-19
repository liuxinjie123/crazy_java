package com.crazy.java003;

public class CreateRandomStr {
    public static void main(String[] args) {
        String result = "";
        for (int i=0; i<6; i++) {
            int intVal = (int) (Math.random()*26 + 97);
            result += (char) intVal;
        }
        System.out.println("result=" + result);
    }
}
