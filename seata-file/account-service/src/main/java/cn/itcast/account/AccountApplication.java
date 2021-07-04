package cn.itcast.account;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 虎哥
 */
@MapperScan("cn.itcast.account.mapper")
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
