package com.order.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "New Order"),
    FINISHED(1, "Order Finished"),
    CANCEL(2, "Order Canceled"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}