package cn.itcast.order.service.impl;

import cn.itcast.order.client.AccountClient;
import cn.itcast.order.client.StorageClient;
import cn.itcast.order.entity.Order;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lauy
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    AccountClient accountClient;

    @Resource
    StorageClient storageClient;

    @Resource
    OrderMapper orderMapper;

    // private final AccountClient accountClient;
    // private final StorageClient storageClient;
    // private final OrderMapper orderMapper;
    //
    // public OrderServiceImpl(AccountClient accountClient, StorageClient storageClient, OrderMapper orderMapper) {
    //     this.accountClient = accountClient;
    //     this.storageClient = storageClient;
    //     this.orderMapper = orderMapper;
    // }

    @Override
    @GlobalTransactional
    public Long create(Order order) {
        // 创建订单
        orderMapper.insert(order);
        try {
            // 扣库存
            storageClient.deduct(order.getCommodityCode(), order.getCount());
            // 扣款
            accountClient.debit(order.getUserId(), order.getMoney());
        } catch (Exception e) {
            log.error("下单失败，原因:{}", e);
        }
        return order.getId();
    }
}
