package com.crazy.java007;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Order implements Serializable {
    private Long id;
    private String code;
    private String content;
}
