package com.crazy.java005.base;

/**
 * 尽量不要在父类构造器中调用将要被子类重写的方法
 */
public class Base {
    public Base() {
        test();
    }
//    public void test() {
    private void test() {
        System.out.println(" 将要被子类重写的方法");
    }
}
