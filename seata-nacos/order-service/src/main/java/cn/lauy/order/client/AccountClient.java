package cn.lauy.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author Lauy
 */
@FeignClient(contextId = "account-service")
@Component
public interface AccountClient {

    @PutMapping("/account/{userId}/{money}")
    void debit(@PathVariable("userId") String userId, @PathVariable("money") Integer money);
}
