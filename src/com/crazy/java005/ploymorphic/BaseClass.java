package com.crazy.java005.ploymorphic;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
public class BaseClass implements Serializable {
    public int book = 6;
    public void base() {
        System.out.println("the base method from BaseClass.");
    }
    public void test() {
        System.out.println("the test method from BaseClass.");
    }
}
