package com.order.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {

    /**
     * Buyer name
     */
    @NotEmpty(message = "Name is mandatory")
    private String name;

    /**
     * Buyer phone
     */
    @NotEmpty(message = "Phone is mandatory")
    private String phone;

    /**
     * Buyer Address
     */
    @NotEmpty(message = "Address is mandatory")
    private String address;

    /**
     * Buyer wechat openid
     */
    @NotEmpty(message = "OpenId is mandatory")
    private String openid;

    /**
     * Shopping cart
     */
    @NotEmpty(message = "shopping cart can not be empty")
    private String items;
}