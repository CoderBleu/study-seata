package cn.lauy.account;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lauy
 */
@MapperScan("cn.lauy.account.mapper")
@SpringBootApplication
@EnableDiscoveryClient
// 开启seata数据源代理
@EnableAutoDataSourceProxy
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
