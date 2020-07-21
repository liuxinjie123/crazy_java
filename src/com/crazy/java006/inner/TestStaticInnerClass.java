package com.crazy.java006.inner;

public class TestStaticInnerClass {
    private int prop1 = 5;
    private static int prop2 = 3;
    static class StaticInnerClass {
        // 静态内部类可以包含静态属性
        private static int age;
        public void accessOuterProp() {
            // 下面代码出现错误，静态内部类无法访问外部非静态属性
//            System.out.println(prop1);
            System.out.println(prop2);
        }
    }
}
