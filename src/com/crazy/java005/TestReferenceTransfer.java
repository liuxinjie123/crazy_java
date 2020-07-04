package com.crazy.java005;

public class TestReferenceTransfer {
    public static void swap(DataWrap dataWrap) {
        int temp = dataWrap.a;
        dataWrap.a = dataWrap.b;
        dataWrap.b = temp;
        System.out.println("in swap method: a=" + dataWrap.a + ", b=" + dataWrap.b);
    }

    public static void main(String[] args) {
        DataWrap dataWrap = new DataWrap();
        dataWrap.a = 6;
        dataWrap.b = 9;
        System.out.println(" start: a=" + dataWrap.a + ", b=" + dataWrap.b);
        swap(dataWrap);
        System.out.println(" end: a=" + dataWrap.a + ", b=" + dataWrap.b);
    }
}
