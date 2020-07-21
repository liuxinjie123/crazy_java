package com.crazy.java006.command;

public class TestCommand {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        // 第一次处理数组，具体处理行为取决于 PrintCommand
        pa.process(target, new PrintCommand());
        System.out.println(" ---------------------- ");
        // 第二次处理数组，具体处理行为取决去 AddCommand
        pa.process(target, new AddCommand());
    }
}
