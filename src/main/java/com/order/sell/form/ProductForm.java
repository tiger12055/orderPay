package com.order.sell.form;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductForm {


    private String productId;

    /** Name. */
    private String productName;

    /** Price per unit. */
    private BigDecimal productPrice;

    /** Stock. */
    private Integer productStock;

    /** Description. */
    private String productDescription;

    /** Image. */
    private String productIcon;

    /** Category Id. */
    private Integer categoryType;
}