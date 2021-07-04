package cn.itcast.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author Lauy
 */
@FeignClient(contextId = "storage-service")
@Component
public interface StorageClient {
    @PutMapping("/storage/{code}/{count}")
    void deduct(@PathVariable("code") String code, @PathVariable("count") Integer count);
}
