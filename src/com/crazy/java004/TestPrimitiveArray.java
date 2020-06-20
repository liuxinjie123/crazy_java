package com.crazy.java004;

public class TestPrimitiveArray {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[5];
        for (int num : intArray) {
            System.out.println(num);
        }
        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i] + 10);
        }
    }
}
