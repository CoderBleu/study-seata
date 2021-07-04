package cn.lauy.storage;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 虎哥
 */
@MapperScan("cn.lauy.storage.mapper")
@SpringBootApplication
// @EnableDiscoveryClient
@EnableAutoDataSourceProxy
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
