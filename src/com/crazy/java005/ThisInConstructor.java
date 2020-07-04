package com.crazy.java005;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class ThisInConstructor implements Serializable {
    /**
     * foo
     */
    private int foo;

    public ThisInConstructor() {
        int foo;
        this.foo = 100;
    }

    public static void main(String[] args) {
        /**
         * ThisInConstructor 创建的对象，foo 都为100
         */
        System.out.println(new ThisInConstructor().foo);
    }
}
