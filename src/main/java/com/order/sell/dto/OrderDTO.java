package com.order.sell.dto;

import com.order.sell.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    /** orderId. */
    private String orderId;

    /** buyerName. */
    private String buyerName;

    /** buyerPhoneNum. */
    private String buyerPhone;

    /** buyerAddress. */
    private String buyerAddress;

    /** buyerOpenid. */
    private String buyerOpenid;

    /** total amount for an order. */
    private BigDecimal orderAmount;

    /** order status. */
    private Integer orderStatus;

    /** payment status. */
    private Integer payStatus;

    /** order create date. */
    private Date createTime;

    /** update time. */
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}