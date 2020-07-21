package com.crazy.java006;

import com.crazy.java006.lee.Output;

public class TestOutputProperty {
    public static void main(String[] args) {
        // 访问另一个包的 Output 接口的 MAX_SIZE 属性
        System.out.println(Output.MAX_CACHE_LINE);
        // Cannot assign a value to final variable 'MAX_SIZE'
//        Output.MAX_SIZE = 30;
    }
}
