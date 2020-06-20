package com.crazy.java003;

public class PrintCircle {
    public static void main(String[] args) {
        printCircleMethod(10);
    }

    public static void printCircleMethod(int radis) {
        for (int i = 0; i < 2*radis -1; i++) {
            for (int j = 0; j <= 3.14*i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
//            for (int j = 2*radis-1; j >= i*i; j--) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
        }
    }


}
