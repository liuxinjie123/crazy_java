package com.crazy.java006;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Address implements Serializable {
    /**
     * detail
     */
    private final String detail;

    /**
     * post code
     */
    private final String postCode;

    public Address() {
        detail = "";
        postCode = "";
    }

    public Address(String detail, String postCode) {
        this.detail = detail;
        this.postCode = postCode;
    }
}
