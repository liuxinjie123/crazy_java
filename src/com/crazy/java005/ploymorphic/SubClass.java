package com.crazy.java005.ploymorphic;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SubClass extends BaseClass implements Serializable {
    private String book = "Miracle Your Life.";
    public void test() {
        System.out.println("the test method from SubClass, will override BaseClass test method.");
    }

    public void sub() {
        System.out.println("the sub method from SubClass.");
    }

    public static void main(String[] args) {
        // BaseClass
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        System.out.printf("\n");

        // SubClass
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();

        System.out.printf("\n");

        BaseClass ploymorphicBc = new SubClass();
        System.out.println(ploymorphicBc.book);
        ploymorphicBc.base();
        ploymorphicBc.test();
    }
}
