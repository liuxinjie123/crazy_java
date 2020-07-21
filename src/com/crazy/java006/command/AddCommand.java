package com.crazy.java006.command;

public class AddCommand implements Command {
    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int num : target) {
            sum += num;
        }
        System.out.println(" the sum of the array is : " + sum);
    }
}
