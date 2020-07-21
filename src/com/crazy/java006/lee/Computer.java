package com.crazy.java006.lee;

public class Computer {
    private Output output;

    public Computer(Output output) {
        this.output = output;
    }

    // 定义一个模拟字符串输入的方法
    public void keyIn(String msg) {
        output.getData(msg);
    }

    // 定义一个模拟打印的方法
    public void print() {
        output.out();
    }
}
