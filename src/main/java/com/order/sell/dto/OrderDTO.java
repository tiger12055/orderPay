package com.order.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.order.sell.dataobject.OrderDetail;
import com.order.sell.enums.OrderStatusEnum;
import com.order.sell.enums.PayStatusEnum;
import com.order.sell.utils.EnumUtil;
import com.order.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** update time. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}