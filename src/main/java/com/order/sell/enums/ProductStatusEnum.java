package com.order.sell.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    UP(0, "upload"),
    DOWN(1, "take down")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
