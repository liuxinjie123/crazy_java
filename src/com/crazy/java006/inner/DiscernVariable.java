package com.crazy.java006.inner;

public class DiscernVariable {
    private String prop = "外部类属性";
    private class InnerClass {
        private String prop = "内部类属性";

        public void info() {
            String prop = "局部变量";
            System.out.println(" 外部类属性值：" + DiscernVariable.this.prop);
            System.out.println(" 内部类属性值：" + this.prop);
            System.out.println(" 局部变量值：" + prop);
        }
    }

    public void test() {
        InnerClass innerClass = new InnerClass();
        innerClass.info();
    }

    public static void main(String[] args) {
        DiscernVariable variable = new DiscernVariable();
        variable.test();
    }
}
