package cn.lauy.account;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 虎哥
 */
@MapperScan("cn.lauy.account.mapper")
// @EnableAutoDataSourceProxy
// (exclude={com.alibaba.cloud.seata.GlobalTransactionAutoConfiguration.class})
@SpringBootApplication
// @EnableDiscoveryClient // 可不加，registry.conf里也注册到了注册中心
@EnableAutoDataSourceProxy
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
