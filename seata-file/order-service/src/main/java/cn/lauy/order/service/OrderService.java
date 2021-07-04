package cn.lauy.order.service;

import cn.lauy.order.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    Long create(Order order);
}