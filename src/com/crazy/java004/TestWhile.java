package com.crazy.java004;

public class TestWhile {
    public static void main(String[] args) {
        int sum = 0;
        int count = 100;
        while (count > 0) {
            sum += count;
            count--;
        }
        System.out.println("sum=" + sum);
    }
}
