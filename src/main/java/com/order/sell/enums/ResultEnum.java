package com.order.sell.enums;

import javafx.scene.input.KeyCodeCombination;
import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(0, "Success"),

    PARAM_ERROR(1, "Parameter is incorrect"),

    PRODUCT_NOT_EXIST(10, "Item not existing"),

    PRODUCT_STOCK_ERROR(11, "Item quantity is not correct"),

    ORDER_NOT_EXIST(12, "Order not existing"),

    ORDERDETAIL_NOT_EXIST(13, "Order detail not existing"),

    ORDER_STATUS_ERROR(14, "Order status not correct"),

    ORDER_UPDATE_FAIL(15, "Fail to update Order"),

    ORDER_DETAIL_EMPTY(16, "Order detail is Empty"),

    ORDER_PAY_STATUS_ERROR(17, "Order payment status is not correct"),

    CART_EMPTY(18, "The shopping cart is empty"),

    ORDER_OWNER_ERROR(19, "This Order is not belong to this user"),

    WECHAT_MP_ERROR(20, "Wechat authorization error"),

    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21, "Wechat payment notification amount is not matched"),

    ORDER_CANCEL_SUCCESS(22, "Order cancel successfully"),

    ORDER_FINISH_SUCCESS(22, "Order finish successfully"),

    PRODUCT_STATUS_ERROR(23, "Product status is incorrect"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}