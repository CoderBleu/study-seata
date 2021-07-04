package cn.itcast.account.service.impl;

import cn.itcast.account.mapper.AccountMapper;
import cn.itcast.account.service.AccountService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 虎哥
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    @Transactional // 此处不涉及其他服务调用，不能使用@GlobalTransactional注解
    public void debit(String userId, int money) {
        log.info("开始扣款");
        accountMapper.debit(userId, money);
        log.info("扣款成功");
    }
}
