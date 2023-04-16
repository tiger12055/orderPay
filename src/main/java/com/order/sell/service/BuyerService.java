package com.order.sell.service;

import com.order.sell.dto.OrderDTO;

public interface BuyerService {

    //look for an order
    OrderDTO findOrderOne(String openid, String orderId);

    //cancel order
    OrderDTO cancelOrder(String openid, String orderId);
}