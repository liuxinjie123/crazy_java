package com.crazy.java006.lee;

public class BetterPrinter implements Output {
    private String[] printData = new String[MAX_CACHE_LINE * 2];

    // 用以记录需要打印的作业数
    private int dataNum = 0;

    @Override
    public void out() {
        // 只要还有作业，继续打印
        while (dataNum > 0) {
            System.out.println("better printer is printing: " + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum > MAX_CACHE_LINE * 2) {
            System.out.println(" the output line is full.");
        } else {
            // 把打印数据添加到队列里
            printData[dataNum++] = msg;
        }
    }
}
