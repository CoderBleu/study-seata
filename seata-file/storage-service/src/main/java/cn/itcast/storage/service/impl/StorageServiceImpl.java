package cn.itcast.storage.service.impl;

import cn.itcast.storage.mapper.StorageMapper;
import cn.itcast.storage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 虎哥
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    /**
     * 此处不涉及其他服务调用，不能使用@GlobalTransactional注解
     * @param commodityCode
     * @param count
     */
    @Transactional
    @Override
    public void deduct(String commodityCode, int count) {
        log.info("开始扣减库存");
        storageMapper.deduct(commodityCode, count);
        log.info("扣减库存成功");
    }
}
