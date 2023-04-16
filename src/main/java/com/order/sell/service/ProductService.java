package com.order.sell.service;

import com.order.sell.dataobject.ProductInfo;
import com.order.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //add quantity in stock
    void increaseStock(List<CartDTO> cartDTOList);

    //decrease quantity in stock
    void decreaseStock(List<CartDTO> cartDTOList);

}