package com.crazy.java006;

import com.crazy.java005.DataWrap;
import static com.crazy.java005.Dog.VERSION;

public class Test6 {
    public static void main(String[] args) {
        DataWrap dataWrap = new DataWrap();
        String version = VERSION;
        System.out.println(" -- test static import. -- version: " + version);
    }
}
