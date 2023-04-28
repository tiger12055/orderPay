package com.order.sell.form;

import lombok.Data;

@Data
public class CategoryForm {

    private Integer categoryId;

    /** Category name. */
    private String categoryName;

    /** Category Id. */
    private Integer categoryType;
}