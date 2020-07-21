package com.crazy.java006.inner;

class Out {
    // 定义一个内部类，不适用访问控制符，即同一个包中其他类可以访问该内部类
    class In {
        public In (String msg) {
            System.out.println("msg");
        }
    }
}

public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("测试信息");
        System.out.println(in.toString());
    }
}
