package com.crazy.java006;

public class LocalInnerClass {
    public static void main(String[] args) {
        // 定义局部内部类
        class InnerBase {
            int a;
        }
        // 定义局部内部类子类
        class InnerSub extends InnerBase {
            int b;

            @Override
            public String toString() {
                return "InnerSub{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }
        }
        // 创建局部内部类对象
        InnerSub sub = new InnerSub();
        sub.a = 6;
        sub.b = 9;
        System.out.println(sub);
    }
}
