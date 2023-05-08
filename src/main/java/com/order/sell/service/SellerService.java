package com.order.sell.service;

import com.order.sell.dataobject.SellerInfo;

public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);
}