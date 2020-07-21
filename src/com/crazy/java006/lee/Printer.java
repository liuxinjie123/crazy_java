package com.crazy.java006.lee;

public class Printer implements Output, Product {

    private String[] printData = new String[MAX_CACHE_LINE];

    // 用于记录当前需要打印的作业数
    private int dataNum = 0;

    @Override
    public void out() {
        // 只要还有作业，继续打印
        while (dataNum > 0) {
            System.out.println(" 打印机打印：" + printData[0]);
            // 作业整体迁移一位，并将剩下的作业数减 1
            System.arraycopy(printData, 1, printData, 0 , --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum > MAX_CACHE_LINE) {
            System.out.println(" the list is full, add failure.");
        } else {
            // add data to list, dataNum++
            printData[dataNum++] = msg;
        }
    }

    @Override
    public int getProductTime() {
        return 45;
    }

    public static void main(String[] args) {
        // create a printer, used as a Output
        Output o = new Printer();
        o.getData("轻量级JavaEE实战");
        o.getData("Crazy Java");
        o.out();

        System.out.printf("\n");

        o.getData("Thinking In Java");
        o.getData("Miracle Your Life");
        o.out();

        System.out.printf("\n");

        // create a Printer,  used as a Product
        Product p = new Printer();
        System.out.println(p.getProductTime());
    }
}
