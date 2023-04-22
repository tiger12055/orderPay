package com.order.sell.service;

import com.order.sell.dto.OrderDTO;

public interface PayService {

    void create(OrderDTO orderDTO);
}
