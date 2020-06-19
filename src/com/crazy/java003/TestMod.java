package com.crazy.java003;

public class TestMod {
    public static void main(String[] args) {
        double a = 5.2;
        double b = 3.1;
        double mod = a % b;
        System.out.println("mod=" + mod);
        System.out.println("5.0 除以 0.0 的结果是：" + (5.0 % 0.0));
        System.out.println("-5.0 除以 0.0 的结果是：" + (-5.0 % 0.0));
        System.out.println("0 除以 5.0 的结果是：" + (0 % 5.0));
        System.out.println("0 除以 0.0 的结果是：" + (0 % 0.0));
        System.out.println("-5 除以 0 的结果是：" + (-5 % 0));
    }
}
