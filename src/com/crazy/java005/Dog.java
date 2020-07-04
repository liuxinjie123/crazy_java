package com.crazy.java005;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Dog implements Serializable {
    /**
     * static
     */
    public static String VERSION = "1.0";

    /**
     * 定义一个 jump 方法
     */
    public void jump() {
        System.out.println(" 正在执行 jump 方法。");
    }

    /**
     * 定义一个 run 方法
     */
    public void run() {
        this.jump();
        System.out.println(" 正在执行 run 方法。");
    }
}
