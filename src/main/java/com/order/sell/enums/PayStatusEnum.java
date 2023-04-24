package com.order.sell.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "Waiting Payment"),
    SUCCESS(1, "Payment Successful"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}