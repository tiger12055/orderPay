package com.order.sell.service;

import com.order.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    /** create order. */
    OrderDTO create(OrderDTO orderDTO);

    /** find order info. */
    OrderDTO findOne(String orderId);

    /** find multiple order info. */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** cancel order. */
    OrderDTO cancel(OrderDTO orderDTO);

    /** finish order. */
    OrderDTO finish(OrderDTO orderDTO);

    /** pay the order. */
    OrderDTO paid(OrderDTO orderDTO);

    Page<OrderDTO> findList(Pageable pageable);
}